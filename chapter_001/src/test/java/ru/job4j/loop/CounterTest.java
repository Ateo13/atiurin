package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author atiurin
 * @since 19.01.2018
 * @version 1.0
 */
public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTwelveThenFourtyTwo() {
        Counter counter = new Counter();
        int result = counter.add(0, 12);
        int expected = 42;
        assertThat(result, is(expected));
    }
}