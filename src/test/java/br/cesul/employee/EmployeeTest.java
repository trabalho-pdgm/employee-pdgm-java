package br.cesul.employee;

import br.cesul.employee.enums.Sex;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    @DisplayName("Calculates the final salary of employee")
    void testCalculateFinalSalaryOfEmployee() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        var employee = new Employee(
                "João",
                "12345",
                "6789",
                LocalDate.parse("20/04/1982", dtf),
                Sex.MALE,
                2500D,
                "555",
                "666");

        assertEquals(2180.3, employee.calculateIncome());
    }
    @Test
    @DisplayName("testCalculateGetDiscount2")
    void testCalculateGetDiscount2() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var employee = new Employee(
                "João",
                "12345",
                "6789",
                LocalDate.parse("20/04/1982", dtf),
                Sex.MALE,
                3500D,
                "555",
                "666");

        assertEquals(2944.8, employee.calculateIncome());


    }

    @Test
    @DisplayName("testCalculateGetDiscount3")
    void testCalculateGetDiscount3() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var employee = new Employee(
                "João",
                "12345",
                "6789",
                LocalDate.parse("20/04/1982", dtf),
                Sex.MALE,
                4500D,
                "555",
                "666");

        assertEquals(3628.63, employee.calculateIncome());
    }

    @Test
    @DisplayName("testCalculateGetDiscount4")
    void testCalculateGetDiscount4() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var employee = new Employee(
                "João",
                "12345",
                "6789",
                LocalDate.parse("20/04/1982", dtf),
                Sex.MALE,
                5000D,
                "555",
                "666");

        assertEquals(3944.3599999999997, employee.calculateIncome());
    }


}
