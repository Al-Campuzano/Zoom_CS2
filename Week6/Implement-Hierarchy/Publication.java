public class Publication {
  private String title;
  private int year;
  private String genre;

  public Publication() {
    this("No title set", 0000, "No genre set");
  }

  public Publication(String newTitle, int newYear, String newGenre) {
    title = newTitle;
    year = newYear;
    genre = newGenre;
  }

  public String getTitle() { return title; }
  public int getYear() { return year; }
  public String getGenre() { return genre; }

  public void setTitle(String newTitle) { title = newTitle; }
  public void setYear(int newYear) { year = newYear; }
  public void setGenre(String newGenre) { genre = newGenre; }

  public String toString() {
    return "The publication: " + title + ", from " + year + ".";
  }
}
