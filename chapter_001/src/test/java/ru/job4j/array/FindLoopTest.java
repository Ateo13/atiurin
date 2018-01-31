package ru.job4j.array;
/**
 * @author atiurin (xxxAteoxxc@gmail.com)
 * @since 31.01.2018
 * @version 1.0
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    // Тест на соответствие
    @Test
    public void whenElEqualsIndex() {
        FindLoop loop = new FindLoop();
        int[] res = {7, 5, 9, 55};
        int result = loop.indexOf(res, 55);
        int expected = 3;
        assertThat(result, is(expected));
    }
    // Тест на несоответствие
    @Test
    public void whenElNotEqualsIndex() {
        FindLoop loop = new FindLoop();
        int[] res = {7, 5, 9, 55};
        int result = loop.indexOf(res, 8);
        int expected = -1;
        assertThat(result, is(expected));
    }
}

