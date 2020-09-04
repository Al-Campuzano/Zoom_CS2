public class Book extends Publication {
  String author;
  int numPages;

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
  public Book(String newAuthor, int newNumPages, String newTitle, int newYear, String newGenre) {
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

}
