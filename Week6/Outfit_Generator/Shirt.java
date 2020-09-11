public class Shirt extends Clothing {

  //// Constructors
  public Shirt() {
    this("T-shirt", "Green", "all", false, true);
  }

  public Shirt(String name, String color, String season, boolean isFancy, boolean isPlain) {
    setName(name);
    setColor(color);
    setSeason(season);
    setIsFancy(isFancy);
    setIsPlain(isPlain);
    // setIsForWinter(isForWinter);
  }

  //// toString method needs to over-write the abstract method from Clothing
  public String toString() {
    return "A " + (isFancy() ? "fancy " : "casual ")
          + (isPlain() ? "plain " : "colorful ")
          + color().toLowerCase() + (season().toLowerCase() == "winter" ? " winter " : " ")
          + name().toLowerCase() + ". ";
  }

}
