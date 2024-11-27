package de.bht.pr2.lession01.beispiel;

public class Beispiel7 {

  // Upgepruefte Ausnahme

  public static int divisionBerechnen(int zaehler) {
    // Kein throws ArithmeticException erforderlich,
    // weil sie ungeprueft ist
    int nenner = 0;
    return zaehler / nenner;
  }

  public static void main(String[] args) {
    double division = 0d;

    try {
      division = divisionBerechnen(100);
    } catch (ArithmeticException e) {
      System.out.println("Irgendwo in divisionBerechnen()-Method ist die Mathe falsch");
      System.out.println(e.toString());
      System.out.println("-----");
    }

    System.out.println("Ergebnis: " + division);
  }
}
