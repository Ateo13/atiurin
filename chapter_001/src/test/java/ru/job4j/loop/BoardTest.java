package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author atiurin
 * @since 22.01.2018
 * @version 1.0
 */
public class BoardTest {
    /**
     * Тест построения шахматной доски размером 3х3
     */
    @Test
    public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
        Board board = new Board();
        String result = board.paint(3, 3);
        final String line = System.getProperty("line.separator");
        String expected = String.format("X X%s X %sX X%s", line, line, line);
        assertThat(result, is(expected));
    }
    /**
     * Тест построения шахматной доски размером 5х4
     */
    @Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
        Board board = new Board();
        String result = board.paint(5, 4);
        final String line = System.getProperty("line.separator");
        String expected = String.format("X X X%s X X %sX X X%s X X %s", line, line, line, line);
        assertThat(result, is(expected));
    }
}
