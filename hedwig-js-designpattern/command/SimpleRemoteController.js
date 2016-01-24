/**
 * Created by patrick on 16/1/16.
 */
var SimpleRemoteControl = function(){
    this.oCommand = null;
};
SimpleRemoteControl.prototype.setCommand = function(oCommand){
    this.oCommand = oCommand;
};
SimpleRemoteControl.prototype.buttonWasPressed = function(){
    this.oCommand.execute();
};
