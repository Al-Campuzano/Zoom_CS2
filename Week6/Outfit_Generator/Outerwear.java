public class Outerwear extends Clothing {

  //// Constructors
  public Outerwear() {
    this("Jacket", "Blue", false, true, true);
  }

  public Outerwear(String name, String color, boolean isFancy, boolean isPlain, boolean isForWinter) {
    setName(name);
    setColor(color);
    setIsFancy(isFancy);
    setIsPlain(isPlain);
    setIsForWinter(isForWinter);
  }

  //// toString method needs to over-write the abstract method from Clothing
  public String toString() {
    return "A " + (isFancy() ? "fancy " : "casual ")
          + (isPlain() ? "plain " : "colorful ")
          + color().toLowerCase() + (isForWinter() ? " winter " : " ")
          + name().toLowerCase() + ". ";
  }

}
