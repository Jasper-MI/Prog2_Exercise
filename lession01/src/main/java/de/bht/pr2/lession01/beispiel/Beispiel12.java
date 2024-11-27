package de.bht.pr2.lession01.beispiel;

public class Beispiel12 {

  // Reinfolge der catch-Bloecke ist wichtig

  public static void main(String[] args) {
    try {
      int[] array = {0, 1, 2, 3, 4};
      array[99999] = 99999;
    } catch (Exception e) {
      if (e instanceof ArrayIndexOutOfBoundsException) {
        System.out.println("Uh oh... Falscher Index in einem Array");
        System.out.println(e);
      }
      // Mehr else if (e instanceof ...Exception)
      // Mehr else if (e instanceof ...Exception)
      // Und letztlich
      else {
        System.out.println("Uh oh... Etwas ist schief gelaufen, keine Ahnung was");
        System.out.println(e);
      }
    }
  }
}
