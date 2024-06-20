package br.cesul.employee;

import br.cesul.employee.enums.Sex;
import br.cesul.employee.exception.InvalidParticipationException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShareHolderTest {

    @Test
    @DisplayName("Calculates the rendiment of shareholder")
    void testCalculateRendimentShareHolder() throws InvalidParticipationException {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        var shareholder = new ShareHolder(
                "Marcos",
                "12345",
                "6789",
                LocalDate.parse("20/04/1982", dtf),
                Sex.MALE,
                30D,
                333333.33);


        assertEquals(5000, shareholder.calculateIncome(), 0.01);
    }

    @Test
    @DisplayName("Calculates the rendiment of shareholder 2")
    void testCalculateRendimentShareHolder2() throws InvalidParticipationException {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        var shareholder = new ShareHolder(
                "Marcos",
                "12345",
                "6789",
                LocalDate.parse("20/04/1982", dtf),
                Sex.MALE,
                60D,
                333333.33);


        assertEquals(19999.9998, shareholder.calculateIncome(), 0.01);
    }
}
