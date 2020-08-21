public class TestClass {

  public static void main(String[] args) {
    System.out.println("Testing computeStyle");
    LegoHat hat = new LegoHat("bowler", 5);

    System.out.println(hat.toString());
    System.out.println(hat.computeStyle("fall"));
  }

}
