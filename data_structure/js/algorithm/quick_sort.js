/**
 * Created by patrick on 15/12/9.
 */

/*
 <p>Quick sort is a efficient sorting algorithm which works by dividing a collection
 into smaller and smaller partitions which become increasingly sorted.
 The approach is to take a single element (called the pivot) and make it so
 that all values before the pivot are smaller, and all elements after the pivot are larger.
 This places the pivot at its final position. The step is repeated for the two parts of the
 collection (before the pivot and after), and then again for the 4 quarters (based on the 2 pivots
 sorted in the previous iteration), and so on until the collection is sorted.</p>

 */

function partition(values,start,end){
    var tempArray = values;
    var value = values[start];
    swap(values,start,end);
    for(var i = start;i<end;i++){
        if(values[i]<=value){
            swap(values,start++,i);
        }
    }
    swap(values,end,start);
    return start;

}

function swap(values,start,end){
    if(start==end) return;
    var temp=values[start];
    values[start]=values[end];
    values[end]=temp;
}


function quick_sort(values,start,end){
    if(start<end){
        var pivot=partition(values,start,end);
        quick_sort(values,start,pivot);
        quick_sort(values,privot,end);
    }
}

function sort(values){
    quick_sort(values,0,values.length-1);
}

console.log(sort([7, 4, 5, 2, 9, 1]));


