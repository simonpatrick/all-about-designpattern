package io.hedwig.designpattern.behavioral.command;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import static org.junit.Assert.assertEquals;

/**
 * Created by patrick on 15/12/23.
 */
public class RemoteControlTest {

    @Rule
    public TestRule watcher = new TestWatcher() {
        protected void starting(Description description) {
            System.out.println("Starting test: " + description.getMethodName());
        }
    };


    @Test
    public void testRemoteControlOnOff() throws Exception {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        assertEquals(true, livingRoomLight.isOn());
        remoteControl.offButtonWasPushed(0);
        assertEquals(false, livingRoomLight.isOn());

    }

    @Test
    public void testRemoteControlUndo() throws Exception {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        assertEquals(true, livingRoomLight.isOn());
        remoteControl.undoButtonWasPushed();
        assertEquals(false, livingRoomLight.isOn());


    }

    @Test
    public void testCeilingFan() throws Exception {
        RemoteControl remoteControl = new RemoteControl();
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        remoteControl.setCommand(0, ceilingFanHighCommand, ceilingFanOffCommand);
        remoteControl.onButtonWasPushed(0);
        assertEquals(ceilingFan.getSpeed(), 3);
        remoteControl.undoButtonWasPushed();
        assertEquals(ceilingFan.getSpeed(), 0);


    }

    @Test
    public void testMacroCommand() throws Exception {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light("Party Room");
        Stereo stereo = new Stereo("Party Room");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        Command[] partyOn = {lightOnCommand, stereoOnWithCDCommand};
        Command[] partyOff = {lightOffCommand, stereoOffCommand};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        remoteControl.onButtonWasPushed(0);
        assertEquals(true, light.isOn());
        assertEquals(true, stereo.isOn());
        remoteControl.undoButtonWasPushed();
        assertEquals(false, light.isOn());
        assertEquals(false, stereo.isOn());

    }
}

