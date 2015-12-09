/**
 * Created by patrick on 15/12/8.
 */

function sort(values) {
    var tempArray = values;
    var length = values.length - 1
    var count=0
    do {

        var swapped = false
        for (var i = 0; i < length; ++i) {
            count+=1
            if (tempArray[i] > tempArray[i + 1]) {
                var temp = tempArray[i];
                tempArray[i] = tempArray[i + 1];
                tempArray[i + 1] = temp;
                swapped = true
            }
        }
        length--
    } while (swapped == true)
    console.log(count)
    return tempArray;
}
console.log(sort([7, 4, 5, 2, 9, 1]));

//冒泡排序是非常容易理解和实现，，以从小到大排序举例：
//
//设数组长度为N。
//
//1．比较相邻的前后二个数据，如果前面数据大于后面的数据，就将二个数据交换。
//
//2．这样对数组的第0个数据到N-1个数据进行一次遍历后，最大的一个数据就“沉”到数组第N-1个位置。
//
//3．N=N-1，如果N不为0就重复前面二步，否则排序完成。


function sort_bubble(values){
    var tempArray = values;
    var length = values.length
    var count=0;
    for(var i=0;i<length;++i){
        for(var j = 0;j<length-i;++j){
            count+=1
            if (tempArray[j] > tempArray[j+1]) {

                var temp = tempArray[j];
                tempArray[j] = tempArray[j+1];
                tempArray[j+1] = temp;
            }
        }
    }
    console.log(count)
    return tempArray;
}

console.log(sort_bubble([7, 4, 5, 2, 9, 1]));

/**
 * 记录swap的位置
 * @param values
 * @returns {*}
 */
function sort_bubble_3(values){
    var tempArray = values;
    var length = values.length;
    var count=0;
    var flag=length;
    while (flag>0){
        var k=flag;
        flag=0;
        for(var j = 1;j<k;++j){
            count+=1;
            if (tempArray[j-1] > tempArray[j]) {
                var temp = tempArray[j-1];
                tempArray[j-1] = tempArray[j];
                tempArray[j] = temp;
                flag=j;
            }
        }
    }
    console.log(count);
    return tempArray;
}

console.log(sort_bubble_3([7, 4, 5, 2, 9, 1]));