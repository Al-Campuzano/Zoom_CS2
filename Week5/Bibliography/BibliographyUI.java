import java.util.ArrayList;

public class BibliographyUI {

  public static void main(String[] args) {

    System.out.println("TESTING BibliographyUI");
    Article art1 = new Article("This is the Title", "This be the Author", null);
    System.out.println(art1.getTitle());
    System.out.println(art1.getAuthor());
    ArrayList<Journal> sampleJournals = Journal.getSampleJournals();
  }

}
