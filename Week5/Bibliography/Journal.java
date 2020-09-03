// Create a class for a Journal. It should have an ArrayList of Issues as well as a title.

import java.util.ArrayList;

public class Journal {
  private String title;
  private ArrayList<Issue> issues;

  public Journal(String newTitle) {
    title = newTitle;
    issues = new ArrayList<Issue>();
  }

  public String getTitle() { return title; }
  public ArrayList<Issue> getIssues() { return issues; }

  public void addIssue(Issue newIssue) {
    issues.add(newIssue);
  }

  // used to find a specific Issue from the ArrayList
  public Issue getIssue(String title) {
    Issue result = null;
    int index = issues.indexOf(title);
    if (index >= 0) {
      result = issues.get(index);
    }
    return result;
  }

  // override the equals method so indexOf can be used to find a specific Journal
  // by matching titles
  public boolean equals(Object obj) {
    boolean result = false;
    if (obj instanceof Journal) {
      Journal j = (Journal)obj;
      result = title.equals(j.getTitle());
    }
    return result;
  }

  // Creates at least two Journal objects that each contain at least 2 Issues
  // that each contain at least 2 Articles. You can use any values you wish,
  // but it should at least appear to be based on realistic data.
  public static ArrayList<Journal> getSampleJournals() {
    // need 2 journals
    Journal jour1 = new Journal("Astrophysics Journal");
    Journal jour2 = new Journal("Journal of Astronomical Sciences");
    // need 4 Issues
    Issue iss1 = new Issue(2010, 3, 2, jour1);
    Issue iss2 = new Issue(2001, 7, 4, jour1);
    Issue iss3 = new Issue(1991, 8, 8, jour2);
    Issue iss4 = new Issue(2010, 10, 3, jour2);
    // add the issues to the journals
    jour1.addIssue(iss1);
    jour1.addIssue(iss2);
    jour2.addIssue(iss3);
    jour2.addIssue(iss4);

    // need 8 Articles
    Article art1 = new Article("From here to Mars", "Kip Thorne", iss1);
    Article art2 = new Article("Black Holes", "Stephen Hawking", iss1);
    Article art3 = new Article("Pulsars among us", "Kip Thorne", iss2);
    Article art4 = new Article("Using Python to process data", "Monty P. Williamson", iss2);
    Article art5 = new Article("Uranus: A GAStronomical Study", "U. Rectum", iss3);
    Article art6 = new Article("Gravitational fields and polarity", "Kip Thorne", iss3);
    Article art7 = new Article("Back to the Moon", "Ray Bradbury", iss4);
    Article art8 = new Article("I'm a Rocket man", "William Shatner", iss4);
    // add the articles to the Issues
    iss1.addArticle(art1);
    iss1.addArticle(art2);
    iss2.addArticle(art3);
    iss2.addArticle(art4);
    iss3.addArticle(art5);
    iss3.addArticle(art6);
    iss4.addArticle(art7);
    iss4.addArticle(art8);

    ArrayList<Journal> sampleJournals = new ArrayList<Journal>(5);
    sampleJournals.add(jour1);
    sampleJournals.add(jour2);

    return sampleJournals;
  }

}
