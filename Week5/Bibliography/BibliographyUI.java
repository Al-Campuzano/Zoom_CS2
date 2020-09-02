import java.util.ArrayList;

public class BibliographyUI {

  public static void main(String[] args) {

    System.out.println("TESTING BibliographyUI");
    // Article art1 = new Article("This is the Title", "This be the Author", null);
    // System.out.println(art1.getTitle());
    // System.out.println(art1.getAuthor());
    BibliographyDatabase data = new BibliographyDatabase(Journal.getSampleJournals());
    // System.out.println(data.get(1).equals(data.get(0)));
    // System.out.println(data.get(1).getTitle());


    ArrayList<Journal> sJournals = Journal.getSampleJournals();

    //data.addListOfJournals(sJournals);
    // Journal jour1 = new Journal("Added Journal");
    // data.addJournal(jour1);

    ArrayList<Issue> listOfIssues = data.getIssues();
    System.out.println("Issues in DB:");
    System.out.println(listOfIssues.get(2));
    data.addArticleToIssue("Added Article", "Al Campuzano", listOfIssues.get(2));
    for (Issue i : listOfIssues) {
      System.out.println(i);
    }

    ArrayList<Article> articlesFrom1910 = data.getArticlesFromYear(1910);
    System.out.println("Articles from 1910: ");
    for (Article a : articlesFrom1910) {
      System.out.println(a);
    }
    // System.out.println(data.journals.get(4).getTitle());
    // System.out.println(data.removeJournal("Added Journal"));
    // System.out.println(sJournals.indexOf("First Journal"));
    // System.out.println(sJournals.get(0).getTitle());
  }

}
