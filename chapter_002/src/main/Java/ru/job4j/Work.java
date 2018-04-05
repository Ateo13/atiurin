package ru.job4j;

public class Work {
    Work work = new Work();
    String name = "Building";

    public Work build(House house) {
        house.name = name;
        return work;
    }
}