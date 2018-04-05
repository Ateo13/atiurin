package ru.job4j;

public class Teach {
    Teach teach = new Teach();
    String name = "Math";

    public Teach study(Student student) {
        student.name = name;
        return teach;
    }
}
