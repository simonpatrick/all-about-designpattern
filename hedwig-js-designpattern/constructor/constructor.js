/**
 * Created by patrick on 15/9/3.
 */
//构建过程和构建内容分离
//分步骤


function House(){
    this.bedroom ="";
    this.keting="";
    this.chufang="";
};

function Baogongtou(){
    this.gaifangzi=function(gongren){
        gongren.jian_chufang();
        gongren.jian_keting();
        gongren.jian_woshi();
    };

    this.jiangfang = function(gongren){
        gaifangzi(gongren);
        gongren.jiaogong();
    }

}

function Gongren(){
    this.jian_woshi = function(){
        console.log("this is woshi");
    };
    this.jian_keting= function(){
        console.log("this is keting");
    };
    this.jian_chufang= function(){
        console.log("this is chufang");
    };

    this.jiaogong = function(){
        var _fangzi = new Fangzi();
        _fangzi.keting='OK';
        _fangzi.bedroom='OK';
        _fangzi.chufang='OK';
        return _fangzi;
    }
}

var baogongtou = new Baogongtou();
var gongren = new Gongren();
baogongtou.gaifangzi(gongren);
baogongtou.jiangfang(gongren);