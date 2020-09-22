package data;

public class Pants extends Clothing {

  //// Constructors
  public Pants() {
    this("Jeans", "Blue", "All", false, true);
  }

  public Pants(String name, String color, String season, boolean isFancy, boolean isPlain) {
    setName(name);
    setColor(color);
    setSeason(season);
    setIsFancy(isFancy);
    setIsPlain(isPlain);
  }

  //// toString method needs to over-write the abstract method from Clothing
  public String toString() {
    return "A pair of " + (isFancy() ? "fancy " : "casual ")
          + (isPlain() ? "plain " : "colorful ")
          + color().toLowerCase() + (season().toLowerCase() == "winter" ? " winter " : " ")
          + name().toLowerCase() + ". ";
  }

}
