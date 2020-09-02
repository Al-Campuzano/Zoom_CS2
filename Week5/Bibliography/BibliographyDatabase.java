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

  // method to find all articles in Database from specific year
  // we set up ArrayList of articles then loop through every Journal and Issue
  // if the issue's year matches then add each article to new ArrayList and return it
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

// method to get list of issues in Database
// we will loop through the journal then the issues and add each issue in turn
// to ArrayList that will be returned.
  public ArrayList<Issue> getIssues() {
    ArrayList<Issue> results = new ArrayList<Issue>();
    for (Journal j : journals) {
      for (Issue i : j.getIssues()) {
        results.add(i);
      }
    }
    return results;
  }

  // method to add article to specified issue
  public void addArticleToIssue(String title, String author, Issue issue) {
    issue.addArticle(new Article(title, author, issue));
  }

  public String getMostPublished() {
    Map<String, Integer> dict = new HashMap<String, Integer>();
    String author, mostArticles = "";
    for (Journal j : journals) { // loop through journals
      for (Issue i : j.getIssues()) { // loop through issues
        for (Article a : i.getArticles()) { // loop through articles
          author = a.getAuthor(); // the author of the current article
          // if mostArticles is empty then set it to current author, else leave it
          mostArticles = mostArticles == "" ? author : mostArticles;
          // get map value of current author
          Integer value = dict.get(author);
          // initialize map value of current author if null otherwise increase it by one
          dict.put(author, (value == null) ? 1 : value + 1);
          // if the current author has more articles then update the mostArticles variable
          if (dict.get(author) > dict.get(mostArticles)){
            mostArticles = author;
          }
        }
      }
    }
    return mostArticles;
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
