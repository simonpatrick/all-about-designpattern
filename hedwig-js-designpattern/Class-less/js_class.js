/**
 * Created by patrick on 16/1/24.
 */

var CAR = function Car(model){
        this.model = model;
        this.color="silver";
        this.year="2012";
        this.getInfo=function(){
            return this.model+":"+this.year;
        }
    };

var myCar = new CAR("ford");

console.log(myCar.year);