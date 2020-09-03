import java.util.ArrayList;
import java.util.Scanner;

public class BibliographyUI {

  private static BibliographyDatabase data;

  public BibliographyUI(BibliographyDatabase newData) {
    data = newData;
  }

  public static void runProgram() {
    System.out.println("\nWelcome to the Bibliography Database!");
    printOptions();
    // Get the user's choice
    Scanner input = new Scanner(System.in);
    int mainChoice = input.nextInt();

    while (mainChoice != 4) {
      switch (mainChoice) {
        case 1:
          findArticleOption();
          break;
        case 2:
          addArticleOption();
          break;
        default:
          System.out.println("Not a valid choice, please try again");
      }
      printOptions();
      mainChoice = input.nextInt();
    }
    
    System.out.println("\nBye!");
  }

  // method to print available options
  public static void printOptions() {
    System.out.println("\nYou may perform the following operations: ");
    System.out.println("  1) Find articles from a given year");
    System.out.println("  2) Add an article to an issue");
    System.out.println("  3) Find the most-published author");
    System.out.println("  4) Exit");
    System.out.print("Please enter your choice (1, 2, or 3): ");
  }

  // method to handle when user wants to find an article
  public static void findArticleOption() {
    // get year from user
    System.out.print("\nWhat year are you interested in? ");
    Scanner input = new Scanner(System.in);
    int yearChoice = input.nextInt();
    // find list of articles in that year from Database
    ArrayList<Article> articlesFound = data.getArticlesFromYear(yearChoice);
    // print out list of articles found
    System.out.println("Here are articles from " + yearChoice + ":");
    for (Article a : articlesFound) {
      System.out.println("  " + a);
    }
  }

  // handles when user wants to add an article
  public static void addArticleOption() {
    // Get list of available issues from Database
    // then print the list
    System.out.println("\nHere are the available issues: ");
    ArrayList<Issue> issuesAvail = data.getIssues();
    for (int i = 0; i < issuesAvail.size(); i++) {
      System.out.println("  " + (i+1) + ") " + issuesAvail.get(i));
    }

    // Get the issue choice from user
    System.out.print("What issue would you like to add to? ");
    Scanner input = new Scanner(System.in);
    int issueChoice = input.nextInt();
    while (issueChoice < 1 || issueChoice > issuesAvail.size()){
      System.out.print("That is an incorrect choice, please try again: ");
      issueChoice = input.nextInt();
    }
    input.nextLine(); // needed to get the newline character from the previous input

    // Get title and author
    System.out.print("Please specify the article title: ");
    String userTitle = input.nextLine();
    System.out.print("Please specify the article author: ");
    String userAuthor = input.nextLine();

    // add article to Database
    data.addArticleToIssue(userTitle, userAuthor, issuesAvail.get(issueChoice - 1));
  }

  public static void main(String[] args) {

    BibliographyUI userInterface = new BibliographyUI(new BibliographyDatabase(Journal.getSampleJournals()));
    userInterface.runProgram();

    // System.out.println("TESTING BibliographyUI");
    // Article art1 = new Article("This is the Title", "This be the Author", null);
    // System.out.println(art1.getTitle());
    // System.out.println(art1.getAuthor());
    // BibliographyDatabase data = new BibliographyDatabase(Journal.getSampleJournals());
    // System.out.println(data.get(1).equals(data.get(0)));
    // System.out.println(data.get(1).getTitle());


    // ArrayList<Journal> sJournals = Journal.getSampleJournals();

    //data.addListOfJournals(sJournals);
    // Journal jour1 = new Journal("Added Journal");
    // data.addJournal(jour1);

    // ArrayList<Issue> listOfIssues = data.getIssues();
    // System.out.println("Issues in DB:");
    // System.out.println(listOfIssues.get(2));
    // data.addArticleToIssue("Added Article", "Second Author", listOfIssues.get(2));
    // for (Issue i : listOfIssues) {
    //   System.out.println(i);
    // }
    //
    // ArrayList<Article> articlesFrom1910 = data.getArticlesFromYear(1910);
    // System.out.println("Articles from 1910: ");
    // for (Article a : articlesFrom1910) {
    //   System.out.println(a);
    // }
    //
    // System.out.println("Most published:");
    // System.out.println(data.getMostPublished());
    // System.out.println(data.journals.get(4).getTitle());
    // System.out.println(data.removeJournal("Added Journal"));
    // System.out.println(sJournals.indexOf("First Journal"));
    // System.out.println(sJournals.get(0).getTitle());
  }

}
