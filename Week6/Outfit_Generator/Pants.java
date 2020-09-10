public class Pants extends Clothing {

  //// Constructors
  public Pants() {
    this("Jeans", "Blue", false, true, true);
  }

  public Pants(String name, String color, boolean isFancy, boolean isPlain, boolean isForSummer) {
    setName(name);
    setColor(color);
    setIsFancy(isFancy);
    setIsPlain(isPlain);
    setIsForSummer(isForSummer);
  }

  //// toString method needs to over-write the abstract method from Clothing
  public String toString() {
    return "A pair of " + (isFancy() ? "fancy " : "casual ")
          + (isPlain() ? "plain " : "colourful ")
          + color() + (isForSummer() ? " summer " : " ")
          + name() + ".";
  }

}
