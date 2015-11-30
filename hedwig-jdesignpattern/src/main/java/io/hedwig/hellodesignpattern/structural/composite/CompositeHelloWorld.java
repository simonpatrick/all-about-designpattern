package io.hedwig.hellodesignpattern.structural.composite;

import io.hedwig.hellodesignpattern.HelloWorld;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CompositeHelloWorld implements HelloWorld {

    private List<HelloWorld> helloWorlds;

    private String lineSeparator = System.getProperty("line.separator");

    public CompositeHelloWorld(HelloWorld... helloWorlds) {
        this.helloWorlds = Arrays.asList(helloWorlds);
    }

    @Override
    public String helloWorld() {
        List<String> helloWorldOuts = helloWorlds.stream().map(HelloWorld::helloWorld).collect(Collectors.toList());
        return StringUtils.join(helloWorldOuts, lineSeparator);
    }

    public static class DefaultHelloWorld implements HelloWorld{

        @Override
        public String helloWorld() {
            return "Hello Composite!";
        }
    }
}
