public class TestBooks {

  public static void main(String[] args) {

    Book test = new Book("Robots and Empire", "Isaac Asimov", "1234567891234");
    Book b2 = new Book("Rendezvous with Rama", "Arthur C Clarke", "1231231231231");
    Book b3 = new Book("Frameshift", "Robert J Sawyer", "1231212345231");
    Book b4 = new Book("Dune", "Frank Herbert", "9991231231231");

    Bookcase bcase = new Bookcase();
    bcase.addBook(test);
    bcase.addBook(b2);
    bcase.addBook(b3);
    bcase.addBook(b4);
    bcase.addBook(test);
    bcase.addBook(b2);
    bcase.addBook(b3);
    bcase.addBook(b4);
    bcase.addBook(test);
    bcase.addBook(b2);
    bcase.addBook(b3);
    bcase.addBook(b4);
    bcase.addBook(test);
    bcase.addBook(b2);
    bcase.addBook(b3);
    bcase.addBook(b4);
    bcase.addBook(test);
    bcase.addBook(b2);
    bcase.addBook(b3);
    bcase.addBook(b4);
    System.out.println("Books in bookcase:");
    bcase.listBooks();

    Reader bookworm = new Reader();

    bookworm.takeOutBook(bcase, "Robots and Empire");
    bookworm.takeOutBook(bcase, "Ender's Game");
    System.out.println("\nAfter taking out a book:");
    bcase.listBooks();
    System.out.println("\nCurrently reading: " + bookworm.getCurrentBook());
    bookworm.putInBook(bcase);
    System.out.println("\nAfter putting it back:");
    bcase.listBooks();
    System.out.println("\nCurrently reading: " + bookworm.getCurrentBook());
    // bcase.removeBook("Robots and Empire");
    // System.out.println("--------After remove------");
//    System.out.println(bcase.removeBook("Dune"));
    // bcase.listBooks();


    // Shelf s = new Shelf();
    //
    // System.out.println(s.removeBook("Dune"));
    // s.addBook(b2);
    // s.addBook(b3);
    // s.addBook(test);
    // s.addBook(b4);
    //
    // System.out.println(s.indexOfBookByTitle("Dune"));
    // System.out.println(s.removeBook("The Fountainhead"));
    // System.out.println(s.indexOfBookByTitle("Dune"));
    //
    // s.addBook(b2);
    // System.out.println(s.indexOfBookByTitle("The Fountainhead"));
    //System.out.println(test);
  }

}
