package de.bht.pr2.lession01.beispiel;

public class Beispiel2 {

  // Mit defensivem Programmieren kann man
  // die Ausnahme vermeiden

  public static void main(String[] args) {
    int zaehler = 100;
    int nenner = ((7 * 21) - 56) % 13; // Am Ende erreichen wir Null

    if (nenner != 0) { // Defensives Programmieren
      double division = zaehler / nenner; // Keine Division durch Null
      System.out.println("Ergebnis: " + division);
    } else {
      System.out.println("Keine Division ausgefuehrt");
    }
  }
}
