package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author atiurin
 * @since 20.01.2018
 * @version 1.2
 */

public class MaxTestTwo {
    /**
     * Test maximum of three values.
     */
    @Test
    public void whatNumberOfThreeIsBigger() {
        Max maximum = new Max();
        int result = maximum.max(Math.max(1, 2), 3);
        assertThat(result, is(3));
    }
}
