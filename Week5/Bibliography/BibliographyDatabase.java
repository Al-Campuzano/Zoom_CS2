// Create a class called BibliographyDatabase.
// Users of the class should be able to add or remove a particular article, issue,
// or journal, and to add a list of journals.

import java.util.*;

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
    Journal temp = new Journal(title);
    int index = journals.indexOf(temp);
    if (index >= 0) {
      journals.remove(index);
      result = true;
    }
    return result;
  }

  public ArrayList<Article> getArticlesFromYear(int year) {
    ArrayList<Article> results = new ArrayList<Article>();
    for (Journal j : journals) {
      for (Issue i : j.getIssues()) {
        if (i.getYear() == year) {
          for (Article a : i.getArticles()) {
            results.add(a);
          }
        }
      }
    }
    return results;
  }

  public ArrayList<Issue> getIssues() {
    ArrayList<Issue> results = new ArrayList<Issue>();
    for (Journal j : journals) {
      for (Issue i : j.getIssues()) {
        results.add(i);
      }
    }
    return results;
  }

  public void addArticleToIssue(String title, String author, Issue issue) {
    issue.addArticle(new Article(title, author, issue));
  }

  public String getMostPublished() {
    String result = "";

    return result;
  }

  // helper method to add articles to ArrayList
  // private ArrayList<Article> addArticleToList(ArrayList<Article> original, ArrayList<Article> toAdd) {
  //   for (Article a : toAdd){
  //     original.add(a);
  //   }
  //   return original;
  // }

  // public void addArticle(Article newArticle, Issue issue) {
  //   issue.addArticle(newArticle);
  // }

  //public void addJournal()
}
