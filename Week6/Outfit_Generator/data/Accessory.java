package data;

public class Accessory extends Clothing {

  //// Constructors
  public Accessory() {
    this("Baseball cap", "Green", "All", false, true);
  }

  public Accessory(String name, String color, String season, boolean isFancy, boolean isPlain) {
    setName(name);
    setColor(color);
    setSeason(season);
    setIsFancy(isFancy);
    setIsPlain(isPlain);
  }

  //// toString method needs to over-write the abstract method from Clothing
  public String toString() {
    return "A " + (isFancy() ? "fancy " : "casual ")
          + (isPlain() ? "plain " : "colorful ")
          + color().toLowerCase() + (season().toLowerCase() == "winter" ? " winter " : " ")
          + name().toLowerCase() + ". ";
  }

}
