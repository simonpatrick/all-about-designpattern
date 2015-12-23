package io.hedwig.alg.basic;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by patrick on 15/8/26.
 */
public class LinkedHashMapSort {
    //linked hash map是有顺序的
    public static void main(String[] args) {
        Map<String,String> linkedMap = new LinkedHashMap<>();
        linkedMap.put("1", "2");
        linkedMap.put("2", "2");
        linkedMap.put("3", "2");
        linkedMap.put("4", "2");
        for (int i = 0; i < 10; i++) {
            System.out.println(linkedMap);
            for (Map.Entry<String, String> entry : linkedMap.entrySet()) {
                System.out.println(entry.getKey());
                //System.out.println(entry.getValue());
            }
        }

        Map<String,String> map = new HashMap<>();
        map.put("1", "2");
        map.put("2", "2");
        map.put("3", "2");
        map.put("4", "2");
        for (int i = 0; i < 10; i++) {
            System.out.println(map);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey());
                //System.out.println(entry.getValue());
            }
        }
    }
}
