package de.bht.pr2.lab03.part1;

import de.bht.pr2.lab03.books.Book.Books;
import de.bht.pr2.lab03.books.CreateBooks;
import de.bht.pr2.lab03.books.eBooks.EBooks;
import de.bht.pr2.lab03.books.hBooks.HBooks;
import de.bht.pr2.lab03.store.BookStore;

import java.text.DecimalFormat;

public class SumPrices {

  public static void main(String[] args) {

    CreateBooks.createBooks(BookStore.getSoldBooks());

    System.out.println(sumBooks());
    System.out.println(sumEBooks());
    System.out.println(sumHBooks());
    System.out.println(sumAllBooks());


    /* Das Ergebnis der Berechnungen sollte sein:

    Summe Buch:     € 381.88
    Summe Ebuch:    € 255.82
    Summe Hoerbuch: € 344.58
    Summe Alle:     € 982.28
   */

  }

  private static final DecimalFormat df = new DecimalFormat("0.00");

  public static String sumBooks () {

    float sum = 0;

    for (int i = 0; i < CreateBooks.booksList.size(); i++) {

      if (!(CreateBooks.booksList.get(i) instanceof EBooks) && !(CreateBooks.booksList.get(i) instanceof HBooks)) {
        sum += CreateBooks.booksList.get(i).price;
      }

    }

    return "Summe Buch: €" + df.format(sum) ;
  }

  public static String sumEBooks () {

    float sum = 0;

    for (int i = 0; i < CreateBooks.booksList.size(); i++) {

      if (CreateBooks.booksList.get(i) instanceof EBooks) {
        sum += CreateBooks.booksList.get(i).price;
      }

    }

    return "Summe EBuch: €" + df.format(sum) ;
  }

  public static String sumHBooks () {

    float sum = 0;

    for (int i = 0; i < CreateBooks.booksList.size(); i++) {

      if (CreateBooks.booksList.get(i) instanceof HBooks) {
        sum += CreateBooks.booksList.get(i).price;
      }

    }

    return "Summe Hoerbuch: €" + df.format(sum) ;
  }

  public static String sumAllBooks () {

    float sum = 0;

    for (Books book : CreateBooks.booksList) {
      if (CreateBooks.booksList.contains(book)) {
        sum += book.price;
      }

    }


    return "Summe Buch: €" + df.format(sum) ;
  }
}
