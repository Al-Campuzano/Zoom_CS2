public class Paperback extends Book {
  private boolean availableInHardCover;

  //// constructors
  // default
  public Paperback() {
    availableInHardCover = false;
  }

  // basic
  public Paperback(boolean newInHardCover) {
    availableInHardCover = newInHardCover;
  }

  // full
  public Paperback(String newTitle, int newYear, String newGenre, String newAuthor,
                   int newNumPages, boolean newInHardCover) {
    super(newTitle, newYear, newGenre, newAuthor, newNumPages);
    availableInHardCover = newInHardCover;
  }

  // getters
  public boolean availableInHardCover() { return availableInHardCover; }

  // setters
  public void setAvailableInHardCover(boolean newInHardCover) {
    availableInHardCover = newInHardCover;
  }

  //// methods
  // overriding toString()
  public String toString() {
    String result = "The paperback book " + getTitle() + ", by " + getAuthor()
          + ", from " + getYear() + ", and it is";
    if(!availableInHardCover) {
      result += " not";
    }
    return result += " available as hard cover.";
  }
}
