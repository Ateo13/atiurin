package ru.job4j.array;
/**
 * @author atiurin (xxxAteoxxc@gmail.com)
 * @since 08.02.2018
 * @version 1.0
 */
public class Matrix {
    /**
     * Метод создает таблицу умножения через двухмерный массивю
     * @param size
     * @return
     */
    int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        return array;
    }
}
