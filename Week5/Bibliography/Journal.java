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

  public void addIssue(Issue newIssue) {
    issues.add(newIssue);
  }

  // Creates at least two Journal objects that each contain at least 2 Issues
  // that each contain at least 2 Articles. You can use any values you wish,
  // but it should at least appear to be based on realistic data.
  public static ArrayList<Journal> getSampleJournals() {
    // need 2 journals
    Journal jour1 = new Journal("First Journal");
    Journal jour2 = new Journal("Second Journal");
    // need 4 Issues
    Issue iss1 = new Issue(1910, 3, 2, jour1);
    Issue iss2 = new Issue(1920, 7, 4, jour1);
    Issue iss3 = new Issue(1930, 8, 8, jour2);
    Issue iss4 = new Issue(1940, 10, 3, jour2);
    // need 8 Articles
    Article art1 = new Article("First Article", "First Author", iss1);
    Article art2 = new Article("Second Article", "Second Author", iss1);
    Article art3 = new Article("Third Article", "Third Author", iss2);
    Article art4 = new Article("Fourth Article", "Fourth Author", iss2);
    Article art5 = new Article("Fifth Article", "Fifth Author", iss3);
    Article art6 = new Article("Sixth Article", "Sixth Author", iss3);
    Article art7 = new Article("Seventh Article", "Seventh Author", iss4);
    Article art8 = new Article("Eighth Article", "Eighth Author", iss4);
// REMOVE THESE AFTER
System.out.println(art1);
System.out.println(iss1);
// REMOVE THOSE AFTER
    ArrayList<Journal> sampleJournals = new ArrayList<Journal>(5);
    sampleJournals.add(jour1);
    sampleJournals.add(jour2);

    return sampleJournals;
  }

}
