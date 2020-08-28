public class Shelf {

  private static final int SHELF_CAPACITY = 3;
  private int numBooks;
  private Book[] books;

  public Shelf() {
    numBooks = 0;
    books = new Book[SHELF_CAPACITY];
  }

  public boolean isFull() {
    return numBooks >= SHELF_CAPACITY;
  }

  public void addBook(Book b) {
    if (!this.isFull()) {
      books[numBooks++] = b;
    }
  }

  // helper function to find if a book is on shelf and where
  // returns -1 if not found
  private int indexOfBookByTitle(String t) {
    int index = -1;
    for (int i = 0; i < numBooks; i++) {
      if (books[i].getTitle() == t) {
        index = i;
      }
    }
    return index;
  }

  public Book removeBook(String bookTitle) {
    Book b = null;
    int index = this.indexOfBookByTitle(bookTitle);
    if (index != -1) {
      b = books[index];
      // put the last book on the shelf in the place where the book we're taking out was
      books[index] = books[numBooks - 1];
      // empty the last spot on the shelf;
      books[numBooks - 1] = null;
      numBooks--; // update the tracker of how many books are on the shelf
    }
    return b;
  }

  public void printBooks() {
    for (int i = 0; i < numBooks; i++) {
      if(books[i] != null){
        System.out.println(books[i]);
      }
    }
  }
}
