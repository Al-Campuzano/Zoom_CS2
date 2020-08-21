public class LegoHat {
  String style;
  int size; // should be between 1-10

  public LegoHat(String newStyle, int newSize) {
    style = newStyle;
    size = newSize;
  }

  public String toString() {
    String sizeInWords = "small";
    if (size > 3 && size <= 6) {
      sizeInWords = "medium";
    } else if (size > 6) {
      sizeInWords = "large";
    }

    return "a " + sizeInWords + " " + style;
  }

  public int computeStyle(String season) {
    return 0;
  }

}
