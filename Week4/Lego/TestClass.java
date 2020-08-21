public class TestClass {

  public static void main(String[] args) {
    System.out.println("---\nTesting Hat");
    LegoHat hat = new LegoHat("bowler", 8);
    System.out.println(hat.toString());
    System.out.println("Style number is: " + hat.computeStyle("fall"));

    LegoHat sombrero = new LegoHat("sombrero", 1);
    System.out.println(sombrero.toString());
    System.out.println("Style number is: " + sombrero.computeStyle("summer"));


    // System.out.println("Testing LegoItem");
    LegoItem item = new LegoItem("sword", 8.8f);
    LegoItem item2 = new LegoItem("shield", 15.0f);
    //
    // System.out.println(item.toString());
    // System.out.println(item.isHeavy(10.1f));

    System.out.println("---\nTesting LegoMinifigure");
    LegoMinifigure figure = new LegoMinifigure("Al", null, null, null);

    // System.out.println(figure.name);
    // System.out.println(figure.hat);
    // System.out.println(figure.leftHand);
    // System.out.println(figure.rightHand);
    //figure.swapHands();
    //figure.wearHat(null);
    //figure.placeInLeftHand(null);
    // figure.placeInRightHand(item2);
    // System.out.println(figure.name);
    // System.out.println(figure.hat);
    //System.out.println(figure.hat.toString());
    // System.out.println(figure.leftHand);
    // System.out.println(figure.rightHand);
    // System.out.println(figure.isGood("fall", 10));
    System.out.println(figure.toString());
  }

}
