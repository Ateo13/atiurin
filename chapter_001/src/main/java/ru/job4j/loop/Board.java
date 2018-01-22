package ru.job4j.loop;
/**
 * @author atiurin
 * @since 22.01.2018
 * @version 1.0
 */
public class Board {
    /**
     * Метод рисует шахматную доску
     * @param width
     * @param height
     * @return
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                // условие проверки, что писать пробел или X
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}




