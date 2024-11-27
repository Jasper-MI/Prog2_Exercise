package de.bht.pr2.lab03.books;

import de.bht.pr2.lab03.books.Book.Books;
import de.bht.pr2.lab03.books.eBooks.EBooks;
import de.bht.pr2.lab03.books.hBooks.HBooks;
import de.bht.pr2.lab03.store.BookStore;

import java.util.ArrayList;
import java.util.List;

public class CreateBooks {

    public static List<Books> booksList = new ArrayList<>();


    // for testing
    public static void main(String[] args) {
        createBooks(BookStore.getSoldBooks());

        System.out.println(getBooksList());
    }

    public static void createBooks( List<String>  data) {

        //System.out.println(data.get(1));
        String tempString;

        for (String part : data) {
            tempString = part;
            String[] splitTempString = tempString.split(";");
            switch (splitTempString[1]) {
                case "Buch" -> {
                    Books book = new Books(splitTempString[0], splitTempString[1], Float.parseFloat(splitTempString[2]), Integer.parseInt(splitTempString[3]));
                    addToBooksList(book);
                }
                case "Ebuch" -> {
                    EBooks eBook = new EBooks(splitTempString[0], splitTempString[1], Float.parseFloat(splitTempString[2]), Integer.parseInt(splitTempString[3]), Integer.parseInt(splitTempString[4]));
                    addToBooksList(eBook);
                }
                case "Hoerbuch" -> {
                    HBooks hBook = new HBooks(splitTempString[0], splitTempString[1], Float.parseFloat(splitTempString[2]), Integer.parseInt(splitTempString[3]), splitTempString[4]);
                    addToBooksList(hBook);
                }
            }
        }
        
    }

    public static void addToBooksList (Books book) {
        booksList.add(book);
    }
    public static List<Books> getBooksList () {
        return booksList;
    }






}
