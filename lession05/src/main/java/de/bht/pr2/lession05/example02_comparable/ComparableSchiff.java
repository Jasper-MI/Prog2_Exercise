package de.bht.pr2.lession05.example02_comparable;

public class ComparableSchiff implements Comparable<ComparableSchiff> {

  // Attribute
  protected String name = "";
  protected Integer laenge = 0;
  protected Integer breite = 0;

  // Konstruktor
  public ComparableSchiff(String name, int laenge, int breite) {
    this.name = name;
    this.laenge = laenge;
    this.breite = breite;
  }

  // Methoden
  public int compareTo(ComparableSchiff b) {
    // Ziel:
    // - return -1 wenn this <  b
    // - return  0 wenn this == b
    // - return  1 wenn this >  b

    // 1. Kriterium: name
    // 2. Kriterium: laenge
    // 3. Kriterium: breite

    final int i = this.getName().compareTo(b.getName());
    if (i != 0) {
      return i;
    }

    final int j = this.getLaenge().compareTo(b.getLaenge());
    if (j != 0) {
      return j;
    }

    return this.getBreite().compareTo(b.getBreite());
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

  public void setBreite(int breite) {
    this.breite = breite;
  }

  public void setLaenge(int laenge) {
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

	