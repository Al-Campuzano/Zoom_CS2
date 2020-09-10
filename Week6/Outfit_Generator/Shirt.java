public class Shirt extends Clothing {

  //// Constructors
  public Shirt() {
    this("T-shirt", "White", false, true, true);
  }

  public Shirt(String name, String color, boolean isFancy, boolean isPlain, boolean isForSummer) {
    setName(name);
    setColor(color);
    setIsFancy(isFancy);
    setIsPlain(isPlain);
    setIsForSummer(isForSummer);
  }

  //// toString method needs to over-write the abstract method from Clothing
  public String toString() {
    return "A " + (isFancy() ? "fancy " : "casual ")
          + (isPlain() ? "plain " : "colourful ")
          + color() + (isForSummer() ? " summer " : " ")
          + name() + ".";
  }

}
