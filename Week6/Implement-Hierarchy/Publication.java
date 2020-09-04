public class Publication {
  private String title;
  private int year;
  private String genre;

  //// constructors
  // default
  public Publication() {
    this("No title set", 0, "No genre set");
  }

  // full constructor
  public Publication(String newTitle, int newYear, String newGenre) {
    title = newTitle;
    year = newYear;
    genre = newGenre;
  }

  //// getters
  public String getTitle() { return title; }
  public int getYear() { return year; }
  public String getGenre() { return genre; }

  //// setters
  public void setTitle(String newTitle) { title = newTitle; }
  public void setYear(int newYear) { year = newYear; }
  public void setGenre(String newGenre) { genre = newGenre; }

  //// methods
  public String toString() {
    return "The publication: " + title + ", from " + year + ".";
  }

  public void greetingMessage() {
    System.out.println("I hope you have a lovely day!");
  }
}
