package de.bht.pr2.lession01.beispiel;

public class Beispiel11b {

  // Reinfolge der catch-Bloecke ist wichtig

  public static void main(String[] args) {
    try {
      int[] array = {0, 1, 2, 3, 4};
      array[99999] = 99999;
    } catch (Exception e) {
      System.out.println("Uh oh... Etwas ist schief gelaufen");
      System.out.println(e);
    }

    /* TODO: Kommentar-Block entfernen
		catch (ArrayIndexOutOfBoundsException e) { // Fehler - Nie erreichbar!
			System.out.println("Uh oh... Falscher Index in einem Array");
			System.out.println(e);
		}
     */
  }
}
