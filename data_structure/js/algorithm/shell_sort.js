/**
 * Created by patrick on 15/12/9.
 */

/*
 希尔排序的实质就是分组插入排序，该方法又称缩小增量排序，因DL．Shell于1959年提出而得名。
 该方法的基本思想是：先将整个待排元素序列分割成若干个子序列（由相隔某个“增量”的元素组成的）分别进行直接插入排序，
 然后依次缩减增量再进行排序，待整个序列中的元素基本有序（增量足够小）时，再对全体元素进行一次直接插入排序。
 因为直接插入排序在元素基本有序的情况下（接近最好情况），效率是很高的，
 因此希尔排序在时间效率上比前两种方法有较大提高。
 以n=10的一个数组49, 38, 65, 97, 26, 13, 27, 49, 55, 4为例

 第一次 gap = 10 / 2 = 5

 49   38   65   97   26   13   27   49   55   4

 1A                                        1B

 2A                                         2B

 3A                                         3B

 4A                                          4B

 5A                                         5B

 1A,1B，2A,2B等为分组标记，数字相同的表示在同一组，大写字母表示是该组的第几个元素， 每次对同一组的数据进行直接插入排序。即分成了五组(49, 13) (38, 27) (65, 49)  (97, 55)  (26, 4)这样每组排序后就变成了(13, 49)  (27, 38)  (49, 65)  (55, 97)  (4, 26)，下同。

 第二次 gap = 5 / 2 = 2

 排序后

 13   27   49   55   4    49   38   65   97   26

 1A             1B             1C              1D            1E

 2A               2B             2C             2D              2E

 第三次 gap = 2 / 2 = 1

 4   26   13   27   38    49   49   55   97   65

 1A   1B     1C    1D    1E      1F     1G    1H     1I     1J

 第四次 gap = 1 / 2 = 0 排序完成得到数组：

 4   13   26   27   38    49   49   55   65   97

 http://zh.wikipedia.org/wiki/%E5%B8%8C%E5%B0%94%E6%8E%92%E5%BA%8
 */

function shell_sort_1(values) {
    var i, j, gap, tempArray = values;

    for (gap = values.length / 2; gap > 0; gap /= 2) {
        for (i = 0; i < gap; i++) {
            for (j = i + gap; j < n; j += gap) {
                if (tempArray[j] < tempArray[j - gap]) {
                    var temp = a[j];
                    var k = j - gap;
                    while (k >= 0 && tempArray[k] > temp) {
                        tempArray[k + gap] = tempArray[k];
                        k -= gap;
                    }
                    tempArray[k + gap] = temp;
                }
            }
        }
    }
}


function shell_sort_2(values){
    var i, j, gap, tempArray = values;
    for (gap = n / 2; gap > 0; gap /= 2)
        for (i = gap; i < n; i++)
            for (j = i - gap; j >= 0 && a[j] > a[j + gap]; j -= gap){
                var temp = tempArray[j];
                tempArray[j] = tempArray[j+gap];
                tempArray[j+gap] = temp;
            }
    return tempArray;
}