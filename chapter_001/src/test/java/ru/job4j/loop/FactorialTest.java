package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author atiurin
 * @since 20.01.2018
 * @version 1.0
 */
public class FactorialTest {
    @Test
    public void whenMultiplyAllNumbersFromOneToSixThenSevenTwoZero() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(6);
        int expected = 720;
        assertThat(result, is(expected));
    }
    @Test
    public void whenMultiplyAllNumbersFromOneToZeroThenOne() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(0);
        int expected = 1;
        assertThat(result, is(expected));
    }
}
