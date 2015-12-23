package io.hedwig.alg.learnalg.qa;

import java.util.HashSet;

/**
 * Created by patrick on 15/6/9.
 *
 * @version $Id$
 */


public class LargestRange {

    /**
     * Given a list of integers, find out the biggest interval
     * that has all its members in the given list.
     * e.g. given list 1, 7, 4, 6, 3, 10, 2 then
     * answer would be [1, 4]. Develop algorithm and
     * write code for this
     *
     * @param array
     * @return
     */
    public int[] largestRange(int[] array){
        int[] range={0,-1};
        HashSet<Integer> set = new HashSet<>();
        for (int i : array) {
            set.add(i);
        }

        while(set.size()>0){
            Integer j = set.iterator().next();
            set.remove(j);
            int a,b;
            for (a=j;set.size()>0 ; a--) {
                if(!set.contains(a-1))
                    break;
                set.remove(a-1);
            }

            for (b = j; set.size()>0 ; b++) {
                if(!set.contains(b+1))
                    break;
                set.remove(b+1);
            }

            if(b-a>range[1]-range[0]){
                range[0]=a;
                range[1]=b;
            }
        }
        return range;
    }
}
