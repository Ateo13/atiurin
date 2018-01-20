package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author atiurin
 * @since 16.01.2018
 * @version 1.0
 */

public class MaxTest {
    /**
     * Test maximum of two values.
     */
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(2134, 2179);
        assertThat(result, is(2179));
    }
}