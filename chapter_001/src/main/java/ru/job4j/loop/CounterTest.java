package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
		int start = 0;
        int finish = 0;
        for(int i = start; i <= end; i++) {
            if(i % 2 == 0) start++;
            else finish++;
        }
        
    }
}