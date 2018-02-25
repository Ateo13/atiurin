package ru.job4j.prov;
/**
 * @author atiurin (xxxAteoxxc@gmail.com)
 * @since 12.02.2018
 * @version 1.1
 */
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class StringFinderTest {
    @Test
    public void stringOneIncludeStringTwo() {
        StringFinder find = new StringFinder();
        boolean result = find.contains("Зачемтаксложно", "сложно");
        boolean excepted = true;
        assertThat(result, is(excepted));
    }
    @Test
    public void stringOneNoIncludeStringTwo() {
        StringFinder find = new StringFinder();
        boolean result = find.contains("Утка", "Коко");
        boolean excepted = false;
        assertThat(result, is(excepted));
    }
}
