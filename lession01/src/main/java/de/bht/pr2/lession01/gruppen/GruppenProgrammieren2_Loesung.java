package de.bht.pr2.lession01.gruppen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GruppenProgrammieren2_Loesung {

  // Wie kann man die rote Wellenlinie loeschen?

  public static void dateiOeffnen(String dateiName) throws IOException {
    // throws ArithmeticException erforderlich,
    // weil sie geprueft ist
    FileInputStream file = new FileInputStream(dateiName);
    file.close();
  }

  public static void main(String[] args) {
    try {
      dateiOeffnen("Beispiel6.java");
    } catch (FileNotFoundException e) {
      System.out.println("Datei nicht gefunden");
      System.out.println(e);
      System.out.println("-----");
    } catch (IOException e) {
      System.out.println("Irgendwo in dateiOeffnen()-Method ist eine Datei-Operation falsch");
      System.out.println(e);
      System.out.println("-----");
    }
  }
}
