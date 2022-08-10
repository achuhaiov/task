package com.task;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
public class TaskTest {

    @Test
    public void calculatePairs() {
        int[] array = {4, 5, 10, 11, 6};
        int m = -1;
        Map<Integer, Integer> result = Task.calculatePairs(array, m);
        //0-1, 2-3, 1-4
        Assert.assertEquals(3, result.size());
        Assert.assertEquals(Integer.valueOf(1), result.get(0));
        Assert.assertEquals(Integer.valueOf(3), result.get(2));
        Assert.assertEquals(Integer.valueOf(4), result.get(1));
    }

}
