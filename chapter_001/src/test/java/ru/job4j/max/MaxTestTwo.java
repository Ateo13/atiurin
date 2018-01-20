package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author atiurin
 * @since 20.01.2018
 * @version 1.0
 */

public class MaxTestTwo {
    /**
     * Test maximum of three values.
     */
    @Test
    public void whatNumberOfThreeIsBigger() {
        Max maximum = new Max();
        int resultOne = maximum.max(1, 2);
        int resultTwo = maximum.max(2, 3);
        assertThat(resultTwo, is(3));
    }
}
