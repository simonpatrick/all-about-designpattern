/**
 * Created by patrick on 16/1/16.
 */
var Light = function(){
    this.bOn = false;
};
Light.prototype.on = function(){
    this.bOn = true;
    console.log("Light is on");
};
Light.prototype.off = function(){
    this.bOn = false;
    console.log("Light is off");
};
