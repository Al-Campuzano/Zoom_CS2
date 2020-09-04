public class HardCover extends Book {
  private boolean hasDustJacket;

  //// constructors
  // default
  public HardCover() {
    hasDustJacket = false;
  }

  // basic
  public HardCover(boolean newDustJacket) {
    hasDustJacket = newDustJacket;
  }

  // full
  public HardCover(String newTitle, int newYear, String newGenre, String newAuthor,
                   int newNumPages, boolean newDustJacket) {
    super(newTitle, newYear, newGenre, newAuthor, newNumPages);
    hasDustJacket = newDustJacket;
  }

  //// getters
  public boolean hasDustJacket() { return hasDustJacket; }

  //// setters
  public void setDustJacket(boolean newJacket) { hasDustJacket = newJacket; }

  //// methods
  // overriding toString()
  public String toString() {
    String result = "The hard-cover book " + getTitle() + ", by " + getAuthor()
          + ", from " + getYear() + ", and it ";
    if(hasDustJacket) {
      result += "has";
    } else {
      result += "does not have";
    }
    return result += " a dust jacket.";
  }
}
