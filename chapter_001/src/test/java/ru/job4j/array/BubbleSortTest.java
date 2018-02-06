package ru.job4j.array;
/**
 * @author atiurin (xxxAteoxxc@gmail.com)
 * @since 06.02.2018
 * @version 1.0
 */
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubble = new BubbleSort();
        int[] res = {1, 6, 4, 2, 3, 9, 7, 8, 0, 5};
        int[] result = bubble.sort(res);
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(result, is(expected));
    }
}
