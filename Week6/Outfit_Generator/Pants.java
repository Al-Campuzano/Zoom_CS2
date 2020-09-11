public class Pants extends Clothing {

  private boolean _isLong;

  //// Constructors
  public Pants() {
    this("Jeans", "Blue", false, true, true);
  }

  public Pants(String name, String color, boolean isFancy, boolean isPlain, boolean isLong) {
    setName(name);
    setColor(color);
    setIsFancy(isFancy);
    setIsPlain(isPlain);
    _isLong = isLong;
  }

  public boolean isForWinter() {
    return _isLong;
  }

  //// toString method needs to over-write the abstract method from Clothing
  public String toString() {
    return "A pair of " + (isFancy() ? "fancy " : "casual ")
          + (isPlain() ? "plain " : "colorful ")
          + color().toLowerCase() + (isForWinter() ? " long " : " short ")
          + name().toLowerCase() + ". ";
  }

}
