package de.bht.pr2.lab01;

public class WrongCourseOfStudiesException extends Exception{
    public WrongCourseOfStudiesException(String e) {
        super("This Course of Studies in not supportet");
    }

}
