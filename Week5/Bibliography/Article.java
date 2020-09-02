// First, create a class for an Article. It should have a title, an author,
// and a reference to the Issue in which it appears (if any).

public class Article {
  private String title;
  private String author;
  private Issue issue;

  public Article(String newTitle, String newAuthor) {
    this(newTitle, newAuthor, null);
  }

  public Article(String newTitle, String newAuthor, Issue newIssue) {
    title = newTitle;
    author = newAuthor;
    issue = newIssue;
  }

  public String getTitle() { return title; }
  public String getAuthor() { return author; }

  // override the equals method so indexOf can be used to find a specific Article
  // by matching authors
  public boolean equals(Object obj) {
    boolean result = false;
    if (obj instanceof Article) {
      Article j = (Article)obj;
      result = author.equals(j.author);
    }
    return result;
  }

  public String toString() {
    return author + ". " + title + ". " + issue.getJournal().getTitle()
           + ", " + issue.getVolume() + "(" + issue.getNumber() + "), "
           + issue.getYear() + ".";
  }

}
