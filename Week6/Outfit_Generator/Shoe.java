public class Shoe extends Clothing {

  //// Constructors
  public Shoe() {
    this("Sneakers", "White", "All", false, false);
  }

  public Shoe(String name, String color, String season, boolean isFancy, boolean isPlain) {
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
