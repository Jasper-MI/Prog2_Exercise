package de.bht.pr2.lession01.gruppen;

import java.io.FileInputStream;
import java.io.IOException;

public class GruppenProgrammieren2_Loesung2 {

  // Wie kann man die rote Wellenlinie loeschen?
  // Alternative Loesung

  public static void dateiOeffnen(String dateiName) throws IOException {
    // throws ArithmeticException erforderlich,
    // weil sie geprueft ist
    FileInputStream file = new FileInputStream(dateiName);
    file.close();
  }

  public static void main(String[] args) {
    try {
      dateiOeffnen("Beispiel6.java");
    }
    // Kein catch-Block mehr fuer FileNotFoundException,
    // weil sie eine Subclass von IOException ist
    catch (IOException e) {
      System.out.println("Irgendwo in dateiOeffnen()-Method ist eine Datei-Operation falsch");
      System.out.println(e);
      System.out.println("-----");
    }
  }
}
