package ru.job4j.loop;
/**
 * @author atiurin
 * @since 20.01.2018
 * @version 1.0
 */
public class Factorial {
    /**
     * Метод находит факториал числа
     * @param n
     * @return
     */
    public int calc(int n) {
        int fact = 1;
        for (int j = 1; j <= n; j++) {
            fact = fact * j;
        }
     return fact;
    }
}
