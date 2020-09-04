public class Magazine extends Publication {
  private String editor;
  private int issue;

  //// constructors
  // default
  public Magazine() {
    this("No editor set", -1);
  }

  // basic magazine constructor
  public Magazine(String newEditor, int newIssue) {
    editor = newEditor;
    issue = newIssue;
  }

  // full constructor
  public Magazine(String newEditor, int newIssue, String newTitle, int newYear, String newGenre) {
    // calls the Publication constructor to set these values
    super(newTitle, newYear, newGenre);
    editor = newEditor;
    issue = newIssue;
  }

  //// getters
  public String getEditor() { return editor; }
  public int getIssue() { return issue; }

  //// setters
  public void setEditor(String newEditor) { editor = newEditor; }
  public void setIssue(int newIssue) { issue = newIssue; }

  //// methods
  // overriding toString()
  public String toString() {
    return "The magazine " + getTitle() + ", issue #" + issue + ", edited by " + editor
          + ", from " + getYear() + ".";
  }
}
