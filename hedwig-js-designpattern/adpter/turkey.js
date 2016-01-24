/**
 * Created by patrick on 16/1/16.
 */

var Turkey = function(){

};
Turkey.prototype.fly = function(){
    throw new Error("This method must be overwritten!");
};
Turkey.prototype.gobble = function(){
    throw new Error("This method must be overwritten!");
};
