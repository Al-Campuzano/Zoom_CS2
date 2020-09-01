// Create a class for an Issue. It should have the year it was published,
// a volume number, an issue number, an ArrayList of Articles,
// and a reference to the Journal under which it was published.

public class Issue {
  private int year;
  private int volume;
  private int number;
  private ArrayList<Article> articles;
  private Journal journal;

  public Issue(int newYear, int newVolume, int newNumber, Journal newJournal) {
    year = newYear;
    volume = newVolume;
    number = newNumber;
    articles = new ArrayList<Article>();
    journal = newJournal;
  }

}
