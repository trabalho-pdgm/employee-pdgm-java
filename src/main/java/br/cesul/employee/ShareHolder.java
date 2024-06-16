package br.cesul.employee;

import br.cesul.employee.enums.Sex;
import br.cesul.employee.exception.InvalidParticipationException;

import java.time.LocalDate;

public class ShareHolder extends Person {
    private static final double MINIMUM_PARTICIPATION = 1;
    private static final double MAXIMUM_PARTICIPATION = 100;
    public static final double PARTICIPATION_THRESHOLD_1 = 25;
    public static final double PARTICIPATION_RATE_1 = 0.01;
    public static final double PARTICIPATION_THRESHOLD_2 = 50;
    public static final double PARTICIPATION_RATE_2 = 0.05;
    public static final double PARTICIPATION_RATE_3 = 0.1;
    private Double share;
    private Double stockValue;

    public ShareHolder(String name, String rg, String cpf, LocalDate birthDate, Sex sex, Double share, Double stockValue) {
        super(name, rg, cpf, birthDate, sex);
        this.share = share;
        this.stockValue = stockValue;
    }

    @Override
    public Double calculateIncome() throws InvalidParticipationException {
        var capital = stockValue * (share / 100);
        double total = 0;

        validateParticipation();

        if (share <= PARTICIPATION_THRESHOLD_1) {
            total = capital * PARTICIPATION_RATE_1;
        } else if (share <= PARTICIPATION_THRESHOLD_2) {
            total = capital * PARTICIPATION_RATE_2;
        } else {
            total = capital * PARTICIPATION_RATE_3;
        }
        return total;
    }

    private void validateParticipation() throws InvalidParticipationException {
        if (share < MINIMUM_PARTICIPATION || share > MAXIMUM_PARTICIPATION) {
            throw new InvalidParticipationException();
        }
    }

    public Double getShare() {
        return share;
    }

    public Double getStockValue() {
        return stockValue;
    }
}