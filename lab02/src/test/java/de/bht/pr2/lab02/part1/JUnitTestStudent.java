package de.bht.pr2.lab02.part1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class JUnitTestStudent {

    @Test
    void testCreateStudentCorrect(){
        try {
            Student student1 = new Student("Anna Alt,70001,Medieninformatik,312");
        } catch ( StudentParseException | RegistrationNumberException | WrongCourseOfStudiesException | NotPaidTuitionFeeException message) {
            fail(message.toString());
        }

        try {
            Student student1 = new Student("Bob Berg,70002,Technische Informatik,312");
        } catch ( StudentParseException | RegistrationNumberException | WrongCourseOfStudiesException | NotPaidTuitionFeeException message) {
            fail(message.toString());
        }

        try {
            Student student1 = new Student("Carla Castor,70003,Druck- und Medientechnik,312");
        } catch ( StudentParseException | RegistrationNumberException | WrongCourseOfStudiesException | NotPaidTuitionFeeException message) {
            fail(message.toString());
        }

        try {
            Student student1 = new Student("Daniel Dorf,70004,Screen Based Media,312");
        } catch ( StudentParseException | RegistrationNumberException | WrongCourseOfStudiesException | NotPaidTuitionFeeException message) {
            fail(message.toString());
        }

        try {
            Student student1 = new Student("Florian Fein,70005,Technische Informatik,312");
        } catch ( StudentParseException | RegistrationNumberException | WrongCourseOfStudiesException | NotPaidTuitionFeeException message) {
            fail(message.toString());
        }
    }

    @Test
    void testCreateStudentWrong(){
        try {
            Student student1 = new Student(",,");
        } catch ( StudentParseException | RegistrationNumberException | WrongCourseOfStudiesException | NotPaidTuitionFeeException message) {
            fail(message.toString());
        }

        try {
            Student student1 = new Student("Zoe Zoo,70026,Technische Informatik,312,mehr Info,noch mehr Info");
        } catch ( StudentParseException | RegistrationNumberException | WrongCourseOfStudiesException | NotPaidTuitionFeeException message) {
            fail(message.toString());
        }

        try {
            Student student1 = new Student("Ingrid Insel,70009,Musik und Tanz,312");
        } catch ( StudentParseException | RegistrationNumberException | WrongCourseOfStudiesException | NotPaidTuitionFeeException message) {
            fail(message.toString());
        }

        try {
            Student student1 = new Student("Daniel Dorf,7000554,Screen Based Media,312");
        } catch ( StudentParseException | RegistrationNumberException | WrongCourseOfStudiesException | NotPaidTuitionFeeException message) {
            fail(message.toString());
        }

        try {
            Student student1 = new Student("Florian Fein,70005,Technische Informatikk,312");
        } catch ( StudentParseException | RegistrationNumberException | WrongCourseOfStudiesException | NotPaidTuitionFeeException message) {
            fail(message.toString());
        }
    }

    @Test
    void testCreateStudent1() {
        try {
            Student student1 = new Student(",,");
        } catch ( StudentParseException | RegistrationNumberException | WrongCourseOfStudiesException | NotPaidTuitionFeeException message) {
            fail(message.toString());
        }
    }

    @Test
    void testCreateStudent2() {
        try {
            Student student1 = new Student("Zoe Zoo,70026,Technische Informatik,312,mehr Info,noch mehr Info");
        } catch ( StudentParseException | RegistrationNumberException | WrongCourseOfStudiesException | NotPaidTuitionFeeException message) {
            fail(message.toString());
        }
    }

    @Test
    void testCreateStudent3() {
        try {
            Student student1 = new Student("Ingrid Insel,70009,Musik und Tanz,312");
        } catch ( StudentParseException | RegistrationNumberException | WrongCourseOfStudiesException | NotPaidTuitionFeeException message) {
            fail(message.toString());
        }
    }

    @Test
    void testCreateStudent4() {
        try {
            Student student1 = new Student("Daniel Dorf,7000554,Screen Based Media,312");
        } catch ( StudentParseException | RegistrationNumberException | WrongCourseOfStudiesException | NotPaidTuitionFeeException message) {
            fail(message.toString());
        }
    }

    @Test
    void testCreateStudent5() {
        try {
            Student student1 = new Student("Florian Fein,70005,Technische Informatikk,312");
        } catch ( StudentParseException | RegistrationNumberException | WrongCourseOfStudiesException | NotPaidTuitionFeeException message) {
            fail(message.toString());
        }
    }
}
