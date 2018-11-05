package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
       int n = 5; {
		int result = 1;
		for (int i = 1; i <=n; i ++){
			result = result*i;
		}
		return result;
	}	
	}	
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
    int n = 0; {
			int result = 1;
		for (int i = 1; i <=n; i ++){
			result = result*i;
		}
		return result;
		
    }
}