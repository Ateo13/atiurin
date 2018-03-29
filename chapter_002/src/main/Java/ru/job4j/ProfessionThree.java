package ru.job4j;

public class ProfessionThree {
    class Teacher extends Profession {
        class Teach {
            Teach teach = new Teach();
            String name = "Math";

            public Teach study(Student student) {
                student.name = name;
                return teach;
            }

            class Student {
                Student student = new Student();
                String name = "Alex";
            }
        }
    }
}
