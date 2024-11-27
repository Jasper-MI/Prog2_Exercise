package de.bht.pr2.lab01;

public class NotPaidTuitionFeeException extends Exception{

    public NotPaidTuitionFeeException(String e) {
        super("The Tuition Fee was not paid");
    }
}
