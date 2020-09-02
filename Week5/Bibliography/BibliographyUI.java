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

    data.addListOfJournals(sJournals);
    Journal jour1 = new Journal("Added Journal");
    data.addJournal(jour1);
    System.out.println(data.journals.get(4).getTitle());
    System.out.println(data.removeJournal("Added Journal"));
    System.out.println(sJournals.indexOf("First Journal"));
    // System.out.println(sJournals.get(0).getTitle());
  }

}
