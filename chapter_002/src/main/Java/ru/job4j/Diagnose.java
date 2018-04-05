package ru.job4j;

public class Diagnose {
    Diagnose diagnose = new Diagnose();
    String name = "Cancer";

    public Diagnose heal(Patient patient) {
        patient.name = name;
        return diagnose;
    }
}
