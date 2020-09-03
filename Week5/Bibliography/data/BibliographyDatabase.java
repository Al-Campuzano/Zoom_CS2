package data;

import java.util.*;

public class BibliographyDatabase {

  public ArrayList<Journal> journals;

  // constructors
  public BibliographyDatabase() {
    this(Journal.getSampleJournals());
  }
  public BibliographyDatabase(ArrayList<Journal> newJournals) {
    journals = newJournals;
  }

  // method to find all articles in Database from specific year
  // we set up an empty string then loop through every Journal and Issue
  // if the issue's year matches then add each article to new string and return it
    public String getArticlesFromYear(int year) {
    String results = "";
    for (Journal j : journals) {
      for (Issue i : j.getIssues()) {
        if (i.getYear() == year) {
          for (Article a : i.getArticles()) {
            results += "  " + a.toString() + "\n";
          }
        }
      }
    }
    return results;
  }

  // method to get list of issues in Database
  // we will loop through the journal then the issues and add each issue in turn
  // to String that will be returned.
  public String getIssues() {
    String results = "";
    int id = 1;
    for (Journal j : journals) {
      for (Issue i : j.getIssues()) {
        results += "  " + id + ") " + i.toString() + "\n";
        i.setId(id);
        id++;
      }
    }
    return results;
  }

  // method to add article to specified issue
  public void addArticleToIssue(String title, String author, int id) {
    for (Journal j : journals) {
      for (Issue i : j.getIssues()) {
        if (i.getId() == id) {
          i.addArticle(new Article(title, author, i));
          return;
        }
      }
    }
  }

  // loops through journals and issues and returns total number of issues available
  public int numChoices() {
    int results = 0;
    for (Journal j : journals) {
      for (Issue i : j.getIssues()) {
        results++;
      }
    }
    return results;
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

  //////
  // The methods below were not needed for the final UI program so i commented
  // them out instead of deleting them so I could get them back easily if necessary
  //////

  // add a new list of journals to the existing one
  // public void addListOfJournals(ArrayList<Journal> newJournals) {
  //   for (Journal j : newJournals) {
  //     journals.add(j);
  //   }
  // }

  // add a new Journal to the existing list
  // public void addJournal(Journal newJournal) {
  //   journals.add(newJournal);
  // }

  // remove a Journal from the list
  // public boolean removeJournal(String title) {
  //   boolean result = false;
  //   Journal temp = new Journal(title);
  //   int index = journals.indexOf(temp);
  //   if (index >= 0) {
  //     journals.remove(index);
  //     result = true;
  //   }
  //   return result;
  // }

}
