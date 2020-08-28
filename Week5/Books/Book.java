// Books should have some key information, such as title, author, and ISBN

public class Book {
  private String title;
  private String author;
  private String isbn;

  public Book (String newTitle, String newAuthor, String newIsbn) {
    title = newTitle;
    author = newAuthor;
    isbn = newIsbn;
  }

  public String toString() {
    return title + " by " + author;
  }
}
