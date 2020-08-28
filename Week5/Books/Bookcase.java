// A bookcase should be able to hold up to 10 books on each of 5 distinct shelves.
// A book can be added or removed from the shelf it is on.
// If removed, a reference to the book should be provided to whoever was asking to remove it.

public class Bookcase {
  private static final int MAX_SHELVES = 5;
  //private int numBooks;
  private Shelf[] shelves;

  public Bookcase() {
    shelves = new Shelf[MAX_SHELVES];
    for (int i = 0; i < MAX_SHELVES; i++) {
      shelves[i] = new Shelf();
    }
  }

  public boolean addBook(Book b) {
    for (int i = 0; i < MAX_SHELVES; i++) {
      if (!shelves[i].isFull()) {
        shelves[i].addBook(b);
        return true;
      }
    }
    return false;
  }

  public Book removeBook(String title) {
    Book b = null;
    int i = 0;
    // go through the shelves and try to remove the book
    // if successful we'll break out of the loop
    // otherwise we get to the end of the shelves and b is still null
    while (i < MAX_SHELVES && b == null) {
      b = shelves[i].removeBook(title);
      i++;
    }
    return b;
  }

  public void listBooks() {
    for (int i = 0; i < MAX_SHELVES; i++) {
      shelves[i].printBooks();
    }
  }
}
