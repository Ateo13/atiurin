package ru.job4j.array;
/**
 * @author atiurin
 * @since 25.01.2018
 * @version 1.0
 */
public class Square {
    /**
     * Создаем массив и заполняем его числами, возведенными в квадрат
     * @param bound
     * @return
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = (int) Math.pow(i + 1, 2);
        }
        return rst;
    }
}
