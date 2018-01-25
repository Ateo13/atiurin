package ru.job4j.max;
/**
 * @author atiurin
 * @since 20.01.2018
 * @version 1.2
 */
public class MaxTwo {
    public int max(int first, int second, int third) {
        return Math.max(Math.max(first, second), third);
    }
}
