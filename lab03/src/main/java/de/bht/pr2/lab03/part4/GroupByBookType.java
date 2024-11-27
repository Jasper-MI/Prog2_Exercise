package de.bht.pr2.lab03.part4;

import de.bht.pr2.lab03.books.Book.Books;
import de.bht.pr2.lab03.books.eBooks.EBooks;
import de.bht.pr2.lab03.books.hBooks.HBooks;
import de.bht.pr2.lab03.store.BookStore;

import java.util.HashSet;
import java.util.Set;

public class GroupByBookType {

  public static Set<Books> booksHashSet = new HashSet<>();

  public static Set<EBooks> eBooksHashSet = new HashSet<>();

  public static Set<HBooks> hBooksHashSet = new HashSet<>();

  public static void main(String[] args) {

    createBookHashSet();
    createEBookHashSet();
    createHBookHashSet();

    /* Das Ergebnis der Berechnungen sollte sein:

Buecher Anzahl: 6
	Buch: 7 Minuten am Tag (2016)
	Buch: Der Heimweg (2016)
	Buch: Ohne Schuld (2020)
	Buch: Escape Room (2020)
	Buch: Der Heimweg (2020)
	Buch: Ohne Schuld (2016)
Ebuecher Anzahl: 4
	Ebuch: Ohne Schuld (2020)
	Ebuch: Der Heimweg (2020)
	Ebuch: Zwei Handvoll Leben (2020)
	Ebuch: Kingsbridge - Der Morgen einer neuen Zeit (2020)
Hoerbuecher Anzahl: 5
	Hoerbuch: QualityLand 2.0 (2019)
	Hoerbuch: Funken Mord (2018)
	Hoerbuch: QualityLand 2.0 (2018)
	Hoerbuch: Funken Mord (2019)
	Hoerbuch: Harry Potter - alle 7 Baende (2018)

     */
  }

  //----- Set of normal Books -------
  public static void createBookHashSet() {

    String tempString;

    for (int i = 0; i < BookStore.getSoldBooks().size(); i++) {
      tempString = BookStore.getSoldBooks().get(i);

      String[] splitTempString = tempString.split(";");

      if (splitTempString[1].equals("Buch")) {
        Books book = new Books(splitTempString[0], splitTempString[1], Float.parseFloat(splitTempString[2]), Integer.parseInt(splitTempString[3]));
        booksHashSet.add(book);
      }

    }

    printBookHashSet();

  }

  public static void printBookHashSet() {

    System.out.println("Buecher Anzahl: " + booksHashSet.size());

    for(Books book : booksHashSet) {
      System.out.println("Buch: " + book.title + " (" + book.edition + ")");
    }
  }


  //----- Set of EBooks -------
  public static void createEBookHashSet() {

    String tempString;

    for (int i = 0; i < BookStore.getSoldBooks().size(); i++) {
      tempString = BookStore.getSoldBooks().get(i);

      String[] splitTempString = tempString.split(";");

      if (splitTempString[1].equals("Ebuch")) {
        EBooks eBook = new EBooks(splitTempString[0], splitTempString[1], Float.parseFloat(splitTempString[2]), Integer.parseInt(splitTempString[3]), Integer.parseInt(splitTempString[4]));
        eBooksHashSet.add(eBook);
      }

    }

    printEBookHashSet();

  }

  public static void printEBookHashSet() {

    System.out.println("Ebuecher Anzahl: " + eBooksHashSet.size());

    for(EBooks eBook : eBooksHashSet) {
      System.out.println("Ebuch: " + eBook.title + " (" + eBook.edition + ")");
    }
  }

  //----- Set of HBooks -------
  public static void createHBookHashSet() {

    String tempString;

    for (int i = 0; i < BookStore.getSoldBooks().size(); i++) {
      tempString = BookStore.getSoldBooks().get(i);

      String[] splitTempString = tempString.split(";");

      if (splitTempString[1].equals("Hoerbuch")) {
        HBooks hBook = new HBooks(splitTempString[0], splitTempString[1], Float.parseFloat(splitTempString[2]), Integer.parseInt(splitTempString[3]), splitTempString[4]);
        hBooksHashSet.add(hBook);
      }

    }

    printHBookHashSet();

  }

  public static void printHBookHashSet() {

    System.out.println("Hoerbuch Anzahl: " + hBooksHashSet.size());

    for(HBooks hBook : hBooksHashSet) {
      System.out.println("Hoerbuch: " + hBook.title + " (" + hBook.edition + ")");
    }
  }
}
