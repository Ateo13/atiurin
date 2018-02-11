package ru.job4j.array;
/**
 * @author atiurin (xxxAteoxxc@gmail.com)
 * @since 11.02.2018
 * @version 1.0
 */
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate dupl = new ArrayDuplicate();
        String[] input = {"Alfa", "Beta", "Omega", "Alfa", "Beta"};
        String[] result = dupl.remove(input);
        String[] excepted = {"Alfa", "Beta", "Omega"};
        assertThat(result, is(excepted));
    }
}

