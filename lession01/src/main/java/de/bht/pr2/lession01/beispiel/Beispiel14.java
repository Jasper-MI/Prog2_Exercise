package de.bht.pr2.lession01.beispiel;

public class Beispiel14 {

  // finally-Block wird IMMER ausgefuehrt

  public static void main(String[] args) {
    try {
      int division = 100 / 0;
    } catch (ArithmeticException e) {
      System.out.println("Division durch Null");
      System.out.println(e);
      System.out.println("-----");
    } finally {
      System.out.println("Hier wird IMMER ausgefuehrt");
    }
  }
}
