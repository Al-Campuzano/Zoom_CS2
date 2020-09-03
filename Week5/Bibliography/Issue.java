// Create a class for an Issue. It should have the year it was published,
// a volume number, an issue number, an ArrayList of Articles,
// and a reference to the Journal under which it was published.

import java.util.ArrayList;

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

  public void addArticle(Article newArticle) {
    articles.add(newArticle);
  }

  public int getYear() { return year; }
  public int getVolume() { return volume; }
  public int getNumber() { return number; }
  public ArrayList<Article> getArticles() { return articles; }
  public Journal getJournal() { return journal; }

  public String toString() {
    return journal.getTitle() + ", Volume " + volume + ", Issue " + number;
  }

  //////
  // The methods below were not needed for the final UI program so i commented
  // them out instead of deleting them so I could get them back easily if necessary
  //////

  // used to find a specific Article from the ArrayList
  // public Article getArticle(String title) {
  //   Article result = null;
  //   int index = articles.indexOf(title);
  //   if (index >= 0) {
  //     result = articles.get(index);
  //   }
  //   return result;
  // }

  // override the equals method so indexOf can be used to find a specific Issue
  // by matching years
  // public boolean equals(Object obj) {
  //   boolean result = false;
  //   if (obj instanceof Issue) {
  //     Issue j = (Issue)obj;
  //     result = year == j.year;
  //   }
  //   return result;
  // }

}
