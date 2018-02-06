package ru.job4j.array;
/**
 * @author atiurin (xxxAteoxxc@gmail.com)
 * @since 06.02.2018
 * @version 1.0
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] res = {2, 4, 6, 8};
        int[] result = turn.back(res);
        int[] expected = {8, 6, 4, 2};
        assertThat(result, is(expected));
    }
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] res = {1, 2, 3, 4, 5};
        int[] result = turn.back(res);
        int[] expected = {5, 4, 3, 2, 1};
        assertThat(result, is(expected));
    }
}
