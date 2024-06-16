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
}
