package ru.job4j.array;
/**
 * @author atiurin (xxxAteoxxc@gmail.com)
 * @since 27.01.2018
 * @version 1.0
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenElEqualsIndex() {
        FindLoop loop = new FindLoop();
        int[] res = new int[1];
        res[1] = 1;
        int result = loop.indexOf(res, 1); //вместо res записываю как угодно и выдает ошибку, что там не int[] - не могу никак записать
        int expected = 1;
        assertThat(result, is(expected));
    }
}
