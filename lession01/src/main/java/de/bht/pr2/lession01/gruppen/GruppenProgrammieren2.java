package de.bht.pr2.lession01.gruppen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class GruppenProgrammieren2 {

  public static void dateiOeffnen(String dateiName) throws FileNotFoundException {
    // throws ArithmeticException erforderlich,
    // weil sie geprueft ist
    FileInputStream file = new FileInputStream(dateiName);

    /* TODO: Kommentar-Block entfernen und Kompiler-Probleme lösen
    file.close();
     */
  }

  public static void main(String[] args) {
    try {
      dateiOeffnen("lession01/src/main/java/de/bht/pr2/lession01/beispiel/Beispiel6.java");
    } catch (FileNotFoundException e) {
      System.out.println("Datei nicht gefunden");
      System.out.println(e);
      System.out.println("-----");
    }
  }
}
