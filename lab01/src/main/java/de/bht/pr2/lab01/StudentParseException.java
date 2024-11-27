package de.bht.pr2.lab01;

public class StudentParseException extends Exception{
    public StudentParseException(String e) {
        super("The format of the Student was wrong");
    }

}
