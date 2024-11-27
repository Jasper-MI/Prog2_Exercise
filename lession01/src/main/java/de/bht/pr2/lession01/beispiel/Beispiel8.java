package de.bht.pr2.lession01.beispiel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Beispiel8 {

  // Gepruefte Ausnahme

  public static void dateiOeffnen(String dateiName) throws FileNotFoundException {
    // throws ArithmeticException erforderlich,
    // weil sie geprueft ist
    FileInputStream file = new FileInputStream(dateiName);
  }

  public static void main(String[] args) {
    try {
      dateiOeffnen("Beispiel6.java");
    } catch (FileNotFoundException e) {
      System.out.println("Datei nicht gefunden");
      System.out.println(e);
      System.out.println("-----");
    }
  }
}
