package ru.job4j.array;
/**
 * @author atiurin
 * @since 25.01.2018
 * @version 1.0
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class SquareTest {
    @Test
    public void addToArraySquareValues() {
        Square square = new Square();
        int[] resultArray = square.calculate(4);
        int[] expectedArray = {1, 4, 9, 16};
        assertThat(resultArray, is(expectedArray));
    }
}

