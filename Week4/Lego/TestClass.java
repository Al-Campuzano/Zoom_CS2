public class TestClass {

  public static void main(String[] args) {
    // System.out.println("Testing computeStyle");
    // LegoHat hat = new LegoHat("bowler", 5);
    //
    // System.out.println(hat.toString());
    // System.out.println(hat.computeStyle("fall"));

    System.out.println("Testing LegoItem");
    LegoItem item = new LegoItem("sword", 8.8f);

    System.out.println(item.toString());
    System.out.println(item.isHeavy(10.1f));
  }

}
