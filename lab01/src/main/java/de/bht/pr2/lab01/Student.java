package de.bht.pr2.lab01;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

  //-------------------------------------------
  // Attribute
  private String name = "";

  // Matrikelnummer
  private int registrationNumber = 0;

  // Medieninformatik, Technische Informatik, Druck- und Medientechnik und Screen Based Media
  private String courseOfStudies = "";

  // Rückmeldegebühr
  public static final int TUITION_FEE = 312;

  /**
   * This contructor parses a comma-separated row describing a student object.
   *
   * @param dataRow a comma-separated row describing a student object
   */
  public Student(String dataRow) throws WrongCourseOfStudiesException, NotPaidTuitionFeeException, StudentParseException {
    // TODO: Here goes your code ...

    //Check dataRow
    try{
      checkDataRow(dataRow);
    } catch (StudentParseException e){
      throw new StudentParseException("");
    }

    ArrayList<String> dataRowSeperated = null;
    dataRowSeperated = new ArrayList<>(Arrays.asList(dataRow.split(",")));
    //System.out.println(dataRowSeperated.get(1));
    this.name = dataRowSeperated.get(0);

    //Registration Number
    try {
      this.registrationNumber = Integer.parseInt(dataRowSeperated.get(1));
    } catch (NumberFormatException e) {
      throw new RegistrationNumberException(e.getMessage());
    }

    //Course of Studies
    try {
      this.courseOfStudies = parseCourseOfStudies(dataRowSeperated.get(2));
    } catch (WrongCourseOfStudiesException e) {
       throw new WrongCourseOfStudiesException(e.getMessage());
    }

    //Tuition Fee
    try {
      parseTuitionFee(Integer.parseInt(dataRowSeperated.get(3)));
    } catch (NotPaidTuitionFeeException e) {
        throw new NotPaidTuitionFeeException(e.getMessage());
    }
  }

  //toSting Methode | Returns name, registration number, course of studies und tuition fee
  @Override
  public String toString() {
    return name + ", " + registrationNumber + ", " + courseOfStudies + ", " + TUITION_FEE;
  }

  //-------------
  //Exeptions

  public void checkDataRow(String dataRow) throws StudentParseException {
    String[] splitDataRow = dataRow.split(",");

    if (splitDataRow.length != 4) {
      throw new StudentParseException("");
    }

  }


  public String parseCourseOfStudies(String courseOfStudies) throws WrongCourseOfStudiesException {
    if (courseOfStudies.equals("Medieninformatik")
            || courseOfStudies.equals("Technische Informatik")
            || courseOfStudies.equals("Druck- und Medientechnik")
            || courseOfStudies.equals("Screen Based Media")
    ) {
      return courseOfStudies;
    } else {
      throw new WrongCourseOfStudiesException("");
    }
  }

  public int parseTuitionFee(int tuitionFee) throws NotPaidTuitionFeeException {
    if (tuitionFee != 312) {
      throw new NotPaidTuitionFeeException("");
    } else {
      return tuitionFee;
    }
  }
}
