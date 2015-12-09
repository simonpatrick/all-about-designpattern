/**
 * Created by patrick on 15/12/9.
 */


/*
 Where a bubble sort relies on a number of small swaps, insertion sort relies on
 inserting a single element in the right for a given iteration.
 Every iteration through the collection leaves a greater segment sorted.
 Insertion sort is a good choice for small or mostly sorted collections.
 It performs well, has little memory overhead and is simple to understand and implement.
 每次将一个待排序的记录，按其关键字大小插入到前面已经排好序的子序列中的适当位置，直到全部记录插入完成为止
 */

/*
 设数组为a[0…n-1]。
 1.      初始时，a[0]自成1个有序区，无序区为a[1..n-1]。令i=1
 2.      将a[i]并入当前的有序区a[0…i-1]中形成a[0…i]的有序区间。
 3.      i++并重复第二步直到i==n-1。排序完成。
 */
function insertion_sort(values) {
    var i, j, k, count;
    var tempArray = values;
    for (i = 1; i < tempArray.length; i++) {
        count++;
        //a[i]找到自己合适的定位
        if (tempArray[i] < tempArray[i - 1]) {
            var temp = tempArray[i];
            for (j = i - 1; j > 0 && tempArray[j] > temp; j--) {
                tempArray[j + 1] = tempArray[j]
            }
            tempArray[j + 1] = temp
        }
    }
    console.log(count);
    return tempArray;
}


function insertion_sort(values) {
    var i, j, k, count;
    var tempArray = values;
    for (i = 1; i < tempArray.length; i++) {
        count++;
        //a[i]找到自己合适的定位
        var temp = tempArray[i];
        for (j = i - 1; j >=0 && tempArray[j] > tempArray[j+1]; j--) {
            //swap
            var temp = tempArray[j+1];
            tempArray[j+1] = tempArray[j]
            tempArray[j] = temp;
        }
    }
    console.log(count);
    return tempArray;
}


var values = [7, 4, 5, 2, 9, 1]
insertion_sort(values);
console.log(values)