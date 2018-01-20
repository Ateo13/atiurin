package ru.job4j.max;
/**
 * @author atiurin
 * @since 20.01.2018
 * @version 1.0
 */
public class MaxTwo {
    public int max(int first, int second, int third) {
        int resultOne = Math.max(first, second);
        int resultTwo = Math.max(resultOne, third);
        return (resultTwo);
    }
}
