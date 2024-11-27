package de.bht.pr2.lession01.beispiel;

public class Beispiel10a {

  // Moeglichst spezifischste Ausnahme benutzen

  public static void main(String[] args) {
    try {
      int[] array = {0, 1, 2, 3, 4};
      array[99999] = 99999;
    } catch (ArrayIndexOutOfBoundsException e) { // Besser als die Superclass,
      // IndexOutOfBoundsException
      // Behandlung mit e
      System.out.println("Uh oh... Falscher Index in einem Array");
      System.out.println(e);
    }
  }
}
