package ru.job4j.loop;
/**
 * @author atiurin
 * @since 19.01.2018
 * @version 1.0
 */
public class Counter {
    /**
     * Метод суммирует все четные числа в диапазоне
     * @param start
     * @param finish
     * @return
     */
    public int add(int start, int finish) {
        int result = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                result = i + result;
            }
        }
        return (result);
    }
}

