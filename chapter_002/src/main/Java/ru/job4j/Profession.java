package ru.job4j;
/**
 * @author atiurin
 * @since 25.03.2018
 * @version 1.0
 */
public class Profession {
    /**
     * Пробуем наследование
     */
    public String name;
    public String profession;

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    class Doctor extends Profession {
        class Diagnose {
            Diagnose diagnose = new Diagnose();
            String name = "Cancer";

            public Diagnose heal(Patient patient) {
                patient.name = name;
                return diagnose;
            }

            class Patient {
                Patient patient = new Patient();
                String name = "Andrei";
            }
        }
    }
}
