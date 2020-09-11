public class Pants extends Clothing {

  private boolean _isLong;

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

  public boolean matchSeason() {
    return true;
  }

  //// toString method needs to over-write the abstract method from Clothing
  public String toString() {
    return "A pair of " + (isFancy() ? "fancy " : "casual ")
          + (isPlain() ? "plain " : "colorful ")
          + color().toLowerCase() + " " + name().toLowerCase() + ". ";
  }

}
