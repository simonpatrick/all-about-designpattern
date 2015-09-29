/**
 * Created by patrick on 15/9/3.
 */

    //构建命令对应的执行

var lian =0;
lian.paobing = function(pao_num){
    alert(pao_num+"canon,start fight");
};

lian.bubing=function(bubing_num){
    alert(bubing_num+"canon,start fight");
};

lian.lianzhang=function(command){
    console.log(command.type+command.num);
    lian[command.type](command.num);
};

//命令的封装
lianzhang({
   type:'paobing',
    num:100
});

lianzhangg({
    type:'bubing',
    num:100
});