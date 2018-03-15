package ru.job4j.array;
/**
 * @author atiurin
 * @since 31.01.2018
 * @version 1.0
 */
public class FindLoop {
    /**
     * Метод ищет определенный элемент в массиве
     * @param data
     * @param el
     * @return
     * если элемента нет в массиве, то возвращаем -1.
     */
    public int indexOf(int[] data, int el) {
        int rsl = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}
