package de.bht.pr2.lab03.books.hBooks;

import de.bht.pr2.lab03.books.Book.Books;

public class HBooks extends Books {

    String listeningMode;


    public HBooks(String title, String typ, float price, int edition, String listeningMode) {
        super(title, typ, price, edition);
        this.listeningMode = listeningMode;
    }

    // or should the constructor look like this:

//    public HBooks(String data) {
//        super(data);
//
//        String[] dataParts = data.split(",");
//        this.listeningMode = dataParts[4];
//    }



    public String getListeningMode() {
        return listeningMode;
    }

    @Override
    public String toString() {
        return "Titel: " + title + "\n Typ: " + typ + "\n Price: " + price + "\n Edition: " + edition + "Listening Mode: " + listeningMode + "\n ------------ \n";
    }

}
