/**
 * Created by patrick on 16/1/16.
 */
var LightOnCommand = function(oLight){
    Command.apply(this);
    this.oLight = oLight;
};
LightOnCommand.prototype = new Command();
LightOnCommand.prototype.execute = function(){
    this.oLight.on();
};