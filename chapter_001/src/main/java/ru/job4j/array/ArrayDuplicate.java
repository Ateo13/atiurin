package ru.job4j.array;
/**
 * @author atiurin (xxxAteoxxc@gmail.com)
 * @since 11.02.2018
 * @version 1.0
 */
import java.util.Arrays;
public class ArrayDuplicate {
    /**
     * Метод удаляет повторяющиеся элементы массива
     * @param array
     * @return
     */
    public String[] remove(String[] array) {
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[unique - 1];
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}
