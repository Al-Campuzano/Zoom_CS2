public class TestHierarchy {

  public static void main(String[] args) {
    System.out.println("Implementing Hierarchy Practice");

  // test publication class
    System.out.println("---Testing Publication class---");
    Publication pub1 = new Publication("The Amory Wars", 2004, "Science Fiction");
    System.out.println(pub1);

    Publication pub2 = new Publication();
    System.out.println(pub2);

  // test magazine class
    System.out.println("---Testing Magazine class---");
    Magazine mag1 = new Magazine("John Campbell", 5);
    mag1.setTitle("Astounding Stories");
    mag1.setYear(1955);
    mag1.setGenre("Science Fiction");
    System.out.println(mag1);

    Magazine mag2 = new Magazine("Amazing Stories", 1959, "Science Fiction", "Frederick Pohl", 11);
    System.out.println(mag2);

  // test book class
    System.out.println("---Testing Book class---");
    Book bk1 = new Book();
    bk1.setAuthor("Robert J. Sawyer");
    bk1.setNumPages(388);
    bk1.setTitle("Flashforward");
    bk1.setYear(1999);
    bk1.setGenre("Science Fiction");
    System.out.println(bk1);

    Book bk2 = new Book("The Mysterious Island", 1895, "Classics", "Jules Verne", 401);
    System.out.println(bk2);

  // test HardCover class
    System.out.println("---Testing HardCover class---");
    HardCover hc1 = new HardCover("Ender's Game", 1984, "Science Fiction", "Orson Scott Card", 349, false);
    System.out.println(hc1);
    hc1.setDustJacket(true);
    hc1.setAuthor("Orson S. Card");
    hc1.setYear(1985);
    System.out.println(hc1);

  // test Paperback Classics
    System.out.println("---Testing Paperback class---");
    Paperback sc1 = new Paperback("Darkly Dreaming Dexter", 2005, "Crime Fiction", "Jeff Lindsay", 299, false);
    System.out.println(sc1);
    sc1.setAvailableInHardCover(true);
    sc1.setYear(2004);
    sc1.setNumPages(289);
    System.out.println(sc1);

  // test inherited methods
    System.out.println("---Testing inherited methods---");
    System.out.println(sc1.rootToString()); // this method is set up in the Book class
    hc1.greetingMessage(); // this one in the Publication class
  }

}
