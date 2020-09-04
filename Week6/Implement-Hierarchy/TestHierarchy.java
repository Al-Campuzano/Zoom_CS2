public class TestHierarchy {

  public static void main(String[] args) {
    System.out.println("Implementing Hierarchy Practice");

  // test publication class
    Publication pub1 = new Publication("The Amory Wars", 2004, "Science Fiction");
    System.out.println(pub1);

    Publication pub2 = new Publication();
    System.out.println(pub2);

  // test magazine class
    Magazine mag1 = new Magazine("John Campbell", 5);
    mag1.setTitle("Astounding Stories");
    mag1.setYear(1955);
    mag1.setGenre("Science Fiction");
    System.out.println(mag1);

    Magazine mag2 = new Magazine("Frederick Pohl", 11, "Amazing Stories", 1959, "Science Fiction");
    System.out.println(mag2);

  // test book class
    Book bk1 = new Book("Robert J. Sawyer", 388);
    bk1.setTitle("Flashforward");
    bk1.setYear(1999);
    bk1.setGenre("Science Fiction");
    System.out.println(bk1);

    Book bk2 = new Book("Jules Verne", 401, "The Mysterious Island", 1895, "Classics");
    System.out.println(bk2);
  }

}
