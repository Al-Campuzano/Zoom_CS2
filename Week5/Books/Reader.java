public class Reader {
  private Book currentlyReading;

  public Reader() {
    currentlyReading = null;
  }

  public String getCurrentBook() {
    return currentlyReading;
  }

  private boolean isReading() {
    return currentlyReading != null;
  }

  public boolean takeOutBook(Bookcase bcase, String title) {
    if (!this.isReading()) {
      currentlyReading = bcase.removeBook(title);
      return true;
    }
    return false;
  }

  public boolean putInBook(Bookcase bcase, Book book) {
    boolean success = bcase.addBook(book);
    if (success) {
      currentlyReading = null;
    }
    return success;
  }
}
