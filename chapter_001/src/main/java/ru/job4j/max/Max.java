package ru.job4j.max;
/**
 * @author atiurin
 * @since 16.01.2018
 * @version 1.0
 */
public class Max {
    public int max(int first, int second) {
        first = 1;
        second = 2;
        int resultMax = Math.max(1, 2);
        int resultMin = Math.min(1, 2);
        return (first < second ? resultMax : resultMin);
    }
    public int max(int first, int second, int third) {
        int resultOne = Math.max(first, second);
        int resultTwo = Math.max(resultOne, third);
     return (resultTwo);
    }
}
