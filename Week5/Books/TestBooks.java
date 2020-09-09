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
    bcase.addBook(new Book("2001", "Arthur C Clarke", "9990999099900"));
    bcase.addBook(new Book("Ubik", "Phillip K Dick", "8890999099900"));
    bcase.addBook(new Book("Wake", "Robert J Sawyer", "9123999099900"));
    bcase.addBook(new Book("Watch", "Robert J Sawyer", "99909990992345"));
    bcase.addBook(new Book("Wonder", "Robert J Sawyer", "999298374099900"));
    bcase.addBook(new Book("Nova", "Samuel Delaney", "915690999099900"));
    bcase.addBook(new Book("Starship Troopers", "Robert Heinlein", "1456799099900"));
    bcase.addBook(new Book("Unknown", "Anon", "11111111111111111"));
    bcase.addBook(new Book("The Yidish Policemen Union", "Michael Chabon", "1567899099900"));
    bcase.addBook(new Book("A New Hope", "George Lucas", "3240999099900"));
    bcase.addBook(new Book("2123", "Kim Stanley Robinson", "8970999012900"));
    bcase.addBook(new Book("Foundation", "Isaac Asimov", "95909990994567"));
    bcase.addBook(new Book("Brave New World", "Aldous Huxley", "99909990999320"));
    bcase.addBook(new Book("1984", "George Orwell", "79909990999320"));
    bcase.addBook(new Book("Gateway", "Frederik Pohl", "69909990999320"));
    bcase.addBook(new Book("Last Year", "Robert Charles Wilson", "49909990999320"));
    System.out.println("Books in bookcase:");
    bcase.listBooks();

    Reader bookworm = new Reader();

    bookworm.takeOutBook(bcase, "Ender's Game");
    bookworm.takeOutBook(bcase, "2001");
    bookworm.takeOutBook(bcase, "Ender's Game");
    System.out.println("\nAfter taking out a book:");
    bcase.listBooks();
    System.out.println("\nCurrently reading: " + bookworm.getCurrentBook());
    bookworm.putInBook(bcase);
    System.out.println("\nAfter putting it back:");
    bcase.listBooks();
    System.out.println("\nCurrently reading: " + bookworm.getCurrentBook());

  }

}
