package de.bht.pr2.lession05.example03_comparator;

public class Schiff {

  // Attribute
  protected String name = "";
  protected Integer laenge = 0;
  protected Integer breite = 0;

  // Konstruktor
  public Schiff(String name, Integer laenge, Integer breite) {
    this.name = name;
    this.laenge = laenge;
    this.breite = breite;
  }

  public Integer getBreite() {
    return breite;
  }

  public Integer getLaenge() {
    return laenge;
  }

  public String getName() {
    return name;
  }

  public void setBreite(Integer breite) {
    this.breite = breite;
  }

  public void setLaenge(Integer laenge) {
    this.laenge = laenge;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "\nSchiff [" +
        "name='" + name +
        ", laenge=" + laenge +
        ", breite=" + breite +
        ']';
  }
}

	