package ru.job4j;

public class ProfessionTwo {
    class Engineer extends Profession {
        class Work {
            Work work = new Work();
            String name = "Building";

            public Work build(House house) {
                house.name = name;
                return work;
            }

            class House {
                House house = new House();
                String name = "Stone";
            }
        }
    }
}
