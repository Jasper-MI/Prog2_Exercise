package de.bht.pr2.lession01.beispiel;

public class Beispiel1 {

  // Eine Ausnahme (ArithmeticException)
  // wird hervorgerufen aber nicht behandelt

  public static void main(String[] args) {
    int zaehler = 100;
    int nenner = ((7 * 21) - 56) % 13; // Am Ende erreichen wir Null

    double division = zaehler / nenner;
    System.out.println("Ergebnis: " + division);
  }
}
