public class LegoHat {
  String style; // options will be toque, sun visor, sombrero, helmet, bowler, fedora
  int size; // should be between 1-10

  public LegoHat(String newStyle, int newSize) {
    style = newStyle;
    size = newSize;
  }

  public String toString() {
    String sizeInWords = "medium";
    if (size <= 3) {
      sizeInWords = "small";
    } else if (size > 6) {
      sizeInWords = "large";
    }
    return "a " + sizeInWords + " " + style;
  }

  // Sombreros are ALWAYS stylish so they always get a 10.
  // Fedoras are NEVER stylish so they always get a 1.
  // Helmets are practical so they always get a 5.
  // Toques are stylish in winter and somewhat stylish in the fall and spring,
  // but not in summer.
  // Sun visors are stylish in summer, somewhat in fall and spring, not in winter.
  // Bowler hats are most stylish in fall and spring, less so in summer and winter.
  // seasons could use 'fall' or 'autumn'
  public int computeStyle(String season) {
    switch(style) {
      case "sombrero":
        return 10;
      case "fedora":
        return 1;
      case "helmet":
        return 5;
      case "toque":
        switch(season) {
          case "winter":
            return 9;
          case "summer":
            return 1;
          default:
            return 6;
        }
      case "sun visor":
        switch(season) {
          case "winter":
            return 1;
          case "summer":
            return 9;
          default:
            return 4;
        }
      case "bowler":
        switch(season) {
          case "fall":
          case "autumn":
          case "spring":
            return 7;
          default:
            return 3;
        }
      default:
        return 5;
    }
  }

}
