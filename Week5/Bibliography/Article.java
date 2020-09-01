// First, create a class for an Article. It should have a title, an author,
// and a reference to the Issue in which it appears (if any).

public class Article {
  private String title;
  private String author;
  private Issue issue;

  public Article(String newTitle, String newAuthor, Issue newIssue) {
    title = newTitle;
    author = newAuthor;
    issue = newIssue;
  }

}
