package de.bht.pr2.lession01.beispiel;

public class Beispiel11a {

  // Reinfolge der catch-Bloecke ist wichtig

  public static void main(String[] args) {
    try {
      int[] array = {0, 1, 2, 3, 4};
      array[99999] = 99999;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Uh oh... Falscher Index in einem Array");
      System.out.println(e);
    } catch (Exception e) {
      System.out.println("Uh oh... Etwas ist schief gelaufen");
      System.out.println(e);
    }
  }
}
