package ru.job4j.loop;

public class Counter {
    public int add(int start, int finish) {

        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                int result = 0;
                result = i + result;
                return (result);
            }
        }
        // сюда он хочет return, но тогда туда не получится вставить result
    }
}

