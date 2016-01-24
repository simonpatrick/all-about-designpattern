/**
 * Created by patrick on 16/1/16.
 */

var Duck = function(){

};

Duck.prototype.fly=function(){
    throw new Error("This method must be overwritted!")
};
Duck.prototype.quack = function(){
    throw new Error("This method must be overwritten!");
};