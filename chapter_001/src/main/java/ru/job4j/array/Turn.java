package ru.job4j.array;
/**
 * @author atiurin (xxxAteoxxc@gmail.com)
 * @since 06.02.2018
 * @version 1.0
 */
public class Turn {
    /**
     * Метод переворачивает массив
     * @param array
     * @return
     */
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i -1] = temp;
        }
        return array;
    }
}
