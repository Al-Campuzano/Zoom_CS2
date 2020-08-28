public class TestBooks {

  public static void main(String[] args) {

    Book test = new Book("Robots and Empire", "Isaac Asimov", "1234567891234");
    Book b2 = new Book("The Fountainhead", "Ayn Rand", "1231231231231");
    Book b3 = new Book("Frameshift", "Robert J Sawyer", "1231212345231");
    Book b4 = new Book("Dune", "Frank Herbert", "9991231231231");
    Shelf s = new Shelf();

    System.out.println(s.removeBook("Dune"));
    s.addBook(b2);
    s.addBook(b3);
    s.addBook(test);
    s.addBook(b4);

    System.out.println(s.indexOfBookByTitle("Dune"));
    System.out.println(s.removeBook("The Fountainhead"));
    System.out.println(s.indexOfBookByTitle("Dune"));

    s.addBook(b2);
    System.out.println(s.indexOfBookByTitle("The Fountainhead"));
    //System.out.println(test);
  }

}
