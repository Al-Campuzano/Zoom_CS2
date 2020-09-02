// Create a class called BibliographyDatabase.
// Users of the class should be able to add or remove a particular article, issue,
// or journal, and to add a list of journals.

import java.util.ArrayList;

public class BibliographyDatabase {

  public ArrayList<Journal> journals;

  // constructors
  public BibliographyDatabase() {
    journals = new ArrayList<Journal>();
  }
  public BibliographyDatabase(ArrayList<Journal> newJournals) {
    journals = newJournals;
  }

  // add a new list of journals to the existing one
  public void addListOfJournals(ArrayList<Journal> newJournals) {
    for (Journal j : newJournals) {
      journals.add(j);
    }
  }

  // add a new Journal to the existing list
  public void addJournal(Journal newJournal) {
    journals.add(newJournal);
  }

  // remove a Journal from the list
  public boolean removeJournal(String title) {
    boolean result = false;
    System.out.println("Title: " + title);
    int index = journals.indexOf(title);
    System.out.println("index: " + index);
    if (index >= 0) {
      journals.remove(index);
      result = true;
    }
    return result;
  }

  // public void addArticle(Article newArticle, Issue issue) {
  //   issue.addArticle(newArticle);
  // }

  //public void addJournal()
}
