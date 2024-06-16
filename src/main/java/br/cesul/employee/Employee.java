package br.cesul.employee;

import br.cesul.employee.enums.Sex;

import java.time.LocalDate;

public class Employee extends Person {
    public static final double SALARY_COMPARISON_1 = 4664.68;
    public static final double SALARY_COMPARISON_2 = 3751.06;
    public static final double SALARY_COMPARISON_3 = 2826.66;
    public static final double SALARY_COMPARISON_4 = 2259.21;
    public static final double IR_FEE_1 = 0.275;
    public static final double IR_FEE_2 = 0.225;
    public static final double IR_FEE_3 = 0.15;
    public static final double IR_FEE_4 = 0.075;
    public static final double IR_DEDUCTION_1 = 869.36;
    public static final double IR_DEDUCTION_2 = 636.13;
    public static final double IR_DEDUCTION_3 = 354.80;
    public static final double IR_DEDUCTION_4 = 142.80;
    public static final double INSS_RATE = 0.11;
    private Double salary;
    private String pis;
    private String ctps;

    public Employee(String name, String rg, String cpf, LocalDate birthDate, Sex sex, Double salary, String pis, String ctps) {
        super(name, rg, cpf, birthDate, sex);
        this.salary = salary;
        this.pis = pis;
        this.ctps = ctps;
    }
    
    @Override
    public Double calculateIncome() {
        double inssDiscount = salary * INSS_RATE;
        return salary - getDiscount() - inssDiscount;
    }

    private Double getDiscount() {
        double discount = 0;

        if (salary > SALARY_COMPARISON_1) {
            discount = (salary * IR_FEE_1) - IR_DEDUCTION_1;
        } else if (salary >= SALARY_COMPARISON_2) {
            discount = (salary * IR_FEE_2) - IR_DEDUCTION_2;
        } else if (salary >= SALARY_COMPARISON_3) {
            discount = (salary * IR_FEE_3) - IR_DEDUCTION_3;
        } else if (salary >= SALARY_COMPARISON_4) {
            discount = (salary * IR_FEE_4) - IR_DEDUCTION_4;
        } else {
            discount = 0;
        }
        return discount;
    }

    public Double getSalary() {
        return salary;
    }

    public String getPis() {
        return pis;
    }

    public String getCtps() {
        return ctps;
    }
}