public class Book extends Publication {
  private String author;
  private int numPages;

  //// constructors
  // default
  public Book() {
    this("No author set", 0);
  }

  // basic book constructor
  public Book(String newAuthor, int newNumPages) {
    author = newAuthor;
    numPages = newNumPages;
  }

  // full constructor
  public Book(String newTitle, int newYear, String newGenre, String newAuthor, int newNumPages) {
    super(newTitle, newYear, newGenre);
    author = newAuthor;
    numPages = newNumPages;
  }

  //// getters
  public String getAuthor() { return author; }
  public int getNumPages() { return numPages; }

  //// setters
  public void setAuthor(String newAuthor) { author = newAuthor; }
  public void setNumPages(int newNumPages) { numPages = newNumPages; }

  //// methods
  // overriding toString()
  public String toString() {
    return "The book " + getTitle() + ", by " + author
          + ", from " + getYear() + ".";
  }

  // calls the Publication toString() method
  public String rootToString() {
    return super.toString();
  }
}
