package br.cesul.employee;

import br.cesul.employee.enums.Sex;
import br.cesul.employee.exception.InvalidParticipationException;

import java.time.LocalDate;

public abstract class Person {
    private final String name;
    private final String rg;
    private final String cpf;
    private final LocalDate birthDate;
    private final Sex sex;

    public Person(String name, String rg, String cpf, LocalDate birthDate, Sex sex) {
        this.name = name;
        this.rg = rg;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.sex = sex;
    }

    public abstract Double calculateIncome() throws InvalidParticipationException;

    public String getName() {
        return name;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Sex getSex() {
        return sex;
    }
}
