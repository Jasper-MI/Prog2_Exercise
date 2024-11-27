package de.bht.pr2.lab03.part3;

import de.bht.pr2.lab03.books.CreateBooks;
import de.bht.pr2.lab03.books.hBooks.HBooks;
import de.bht.pr2.lab03.store.BookStore;

public class StreamingAudioBookCount {

  public static void main(String[] args) {

    CreateBooks.createBooks(BookStore.getSoldBooks());

    System.out.println(countStreamingHBooks());

    /* Das Ergebnis der Berechnungen sollte sein:

    Anzahl Hoerbuecher per Streaming: 5

     */
  }

  public static String countStreamingHBooks() {

    int sum = 0;

    for (int i = 0; i < CreateBooks.booksList.size(); i++) {
      if (CreateBooks.booksList.get(i) instanceof HBooks) {

        if (((HBooks) CreateBooks.booksList.get(i)).getListeningMode().equals("Streaming")) {
          sum++;
        }

      }


    }

    return "Anzahl Hoerbuecher per Streaming: " + sum;
  }

}
