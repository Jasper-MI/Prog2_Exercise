package de.bht.pr2.lab03.books.eBooks;

import de.bht.pr2.lab03.books.Book.Books;

public class EBooks extends Books {

    int tVersion;


    public EBooks(String title, String typ, float price, int edition, int tVersion) {
        super(title, typ, price, edition);
        this.tVersion = tVersion;
    }

    // or should the constructor look like this:

//    public EBooks(String data) {
//        super(data);
//
//        String[] dataParts = data.split(",");
//        this.tVersion = Integer.parseInt(dataParts[4]);
//    }

    public float getPrice() {
       return super.getPrice();
    }

    public int getTVersion() {
        return  tVersion;
    }
    @Override
    public String toString() {
        return "Titel: " + title + "\n Typ: " + typ + "\n Price: " + price + "\n Edition: " + edition + "tVersion: " + tVersion + "\n ------------ \n";
    }


}
