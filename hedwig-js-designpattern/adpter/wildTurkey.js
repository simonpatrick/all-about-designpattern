/**
 * Created by patrick on 16/1/16.
 */

var WildTurkey = function(){
    Turkey.apply(this);
};
WildTurkey.prototype = new Turkey();
WildTurkey.prototype.fly = function(){
    console.log("Fly short distance!");
};
WildTurkey.prototype.gobble = function(){
    console.log("Gobble! Gobble!");
};