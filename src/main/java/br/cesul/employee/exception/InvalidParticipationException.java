package br.cesul.employee.exception;

public class InvalidParticipationException extends Exception {
    public InvalidParticipationException() {
        super("The participation of shareholder must be minimum 1% and maximum 100%");
    }
}
