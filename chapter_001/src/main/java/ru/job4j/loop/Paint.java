package ru.job4j.loop;
/**
 * @author atiurin
 * @since 23.01.2018
 * @version 1.0
 */
public class Paint {
    /**
     * Метод рисует пирамиду
     * @param height
     * @return
     */
    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

}
