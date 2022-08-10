package com.task;

import java.util.HashMap;
import java.util.Map;

public class Task {

    //complexity - O(2n)
    public static Map<Integer, Integer> calculatePairs(int[] array, int m) {
        Map<Integer, Integer> pairs = new HashMap<>();

        //complexity - O(n)
        Map<Integer, Integer> valueIndexMap = new HashMap<>();
        for (int i = 0; i < array.length; ++i) {
            valueIndexMap.put(array[i], i);
        }

        //complexity - O(n)
        for (int i = 0; i < array.length; ++i) {
            //complexity - O(1)
            Integer index = valueIndexMap.get(array[i] - m);
            if (index != null) {
                pairs.put(i, index);
            }
        }

        return pairs;
    }

}
