package de.bht.pr2.lab01;

public class RegistrationNumberException extends NumberFormatException{

    public RegistrationNumberException(String e) {
        super("The Registration Number is in the wrong format!");
    }
}
