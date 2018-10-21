package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
@Test
public void whenFirstLessSecond() {
    Max maxim = new Max();
    int result = maxim.max(1, 2);
    assertThat(result, is(2));
}
 public int max(int first, int second, int third)
 {
	 if (first>second && first>third) {
		 return first;
	 } else if (second>first && second>third) {
		 return second;
	 } else {
         return third;
	 }
 } 
 }

}