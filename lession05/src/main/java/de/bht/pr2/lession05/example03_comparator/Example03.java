package de.bht.pr2.lession05.example03_comparator;

import java.util.ArrayList;
import java.util.List;

public class Example03 {

    // Comparator

    public static void main(String[] args) {
        //-----------------------------
        // Objekte in einer Liste einfuegen
        List<Schiff> listeVonSchiffen = new ArrayList<>();
        listeVonSchiffen.add(new Schiff("N", 40, 30));
        listeVonSchiffen.add(new Schiff("M", 50, 20));
        listeVonSchiffen.add(new Schiff("N", 40, 20));
        listeVonSchiffen.add(new Schiff("N", 30, 20));

        System.out.println(listeVonSchiffen);

        SchiffComparator schiffComparator = new SchiffComparator();
        listeVonSchiffen.sort(schiffComparator);

        System.out.println("----- Nach Collections.sort -----");
        System.out.println(listeVonSchiffen);
    }
}
