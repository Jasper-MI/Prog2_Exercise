package de.bht.pr2.lab03.books.Book;

import java.util.Objects;

public class Books{

    public String title;
    public String typ;
    public float price;
    public int edition;

    public Books(String title, String typ, float price, int edition) {
        this.title = title;
        this.typ = typ;
        this.price = price;
        this.edition = edition;
    }

    // or should the constructor look like this:

//    public Books(String data) {
//        String[] dataPart = data.split(",");
//
//
//        title = dataPart[0];
//        typ = dataPart[1];
//        price = Float.parseFloat(dataPart[2]);
//        edition = Integer.parseInt(dataPart[3]);
//    }

    // Part 0



    //Part 1 Sum-Price


    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Titel: " + title + "\n Typ: " + typ + "\n Price: " + price + "\n Edition: " + edition + "\n ------------ \n";
    }

    @Override
    public boolean equals(Object o) {

        if(this == o) {
            return true;
        }

        if(o == null || getClass() != o.getClass()) {
            return false;
        }

        Books book = (Books) o;

        if(!Objects.equals(title, book.title)) {
            return false;
        }

        return edition == book.edition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, edition);
    }
}
