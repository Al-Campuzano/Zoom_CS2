public class Reader {
  private Book currentlyReading;

  public Reader() {
    currentlyReading = null;
  }

  public String getCurrentBook() {
    return this.isReading() ? currentlyReading.toString() : "Not reading anything at the moment";
  }

  // helper method to indicate if Reader already has a book "checked out"
  private boolean isReading() {
    return currentlyReading != null;
  }

  public boolean takeOutBook(Bookcase bcase, String title) {
    if (!this.isReading()) {
      currentlyReading = bcase.removeBook(title);
      return true;
    }
    System.out.println("Already reading " + currentlyReading.toString());
    return false;
  }

  public boolean putInBook(Bookcase bcase) {
    boolean success = false;
    // check that the reader is actually reading something
    if (this.isReading()){
      // store whether adding the book to the shelf was successful
      success = bcase.addBook(currentlyReading);
    }
    // if putting the book back on the shelf worked fine then Reader is no longer
    // reading anything
    if (success) {
      currentlyReading = null;
    }
    return success;
  }
}
