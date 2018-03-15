package ru.job4j.prov;
/**
 * @author atiurin (xxxAteoxxc@gmail.com)
 * @since 12.02.2018
 * @version 1.2
 */
public class StringFinder {
    /**
     * Метод проверяет, находится ли одно слово в другом
     * @param origin
     * @param sub
     * @return result
     */
    boolean contains(String origin, String sub) {
        char[] orig = origin.toCharArray();
        char[] s = sub.toCharArray();
        boolean result = false;
        for (int i = 0; i < orig.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (orig[i] == s[j]) {
                    if (orig[i] != s[j])
                        break;
                    result = true;
                }
            }
        }
        return result;
    }
}