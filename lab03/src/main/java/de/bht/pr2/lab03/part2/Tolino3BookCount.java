package de.bht.pr2.lab03.part2;

import de.bht.pr2.lab03.books.CreateBooks;
import de.bht.pr2.lab03.books.eBooks.EBooks;
import de.bht.pr2.lab03.store.BookStore;

public class Tolino3BookCount {

  public static void main(String[] args) {

    CreateBooks.createBooks(BookStore.getSoldBooks());

    System.out.println(countTolino3());

    /* Das Ergebnis der Berechnungen sollte sein:

    Anzahl Ebuecher bei Tolino 3: 9

     */
  }

  public static String countTolino3() {

    int sum = 0;

    for (int i = 0; i < CreateBooks.booksList.size(); i++) {
      if (CreateBooks.booksList.get(i) instanceof EBooks) {
        if (((EBooks) CreateBooks.booksList.get(i)).getTVersion() == 3 ) {
          sum++;
        }

      }
    }

    return "Anzahl Ebuecher bei Tolino 3: " + sum;
  }
}
