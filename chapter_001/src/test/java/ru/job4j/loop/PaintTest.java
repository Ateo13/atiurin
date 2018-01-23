package ru.job4j.loop;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
/**
 * @author atiurin
 * @since 23.01.2018
 * @version 1.0
 */
public class PaintTest {
    @Test
    public void whenPyramidLeftPlusRight() {
        Paint paint = new Paint();
        String rst = paint.pyramid(4);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^   ")
                                .add("  ^^^  ")
                                .add(" ^^^^^ ")
                                .add("^^^^^^^")
                                .toString()
                )
        );
    }
}

