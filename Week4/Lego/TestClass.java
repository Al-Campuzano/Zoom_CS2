public class TestClass {

  public static void main(String[] args) {
    // System.out.println("Testing computeStyle");
    LegoHat hat = new LegoHat("bowler", 8);
    LegoHat sombrero = new LegoHat("sombrero", 1);
    //
    // System.out.println(hat.toString());
    // System.out.println(hat.computeStyle("fall"));

    // System.out.println("Testing LegoItem");
    LegoItem item = new LegoItem("sword", 8.8f);
    LegoItem item2 = new LegoItem("shield", 15.0f);
    //
    // System.out.println(item.toString());
    // System.out.println(item.isHeavy(10.1f));

    System.out.println("Testing LegoMinifigure");
    LegoMinifigure figure = new LegoMinifigure("Al", hat, item, item2);

    System.out.println(figure.name);
    System.out.println(figure.hat);
    System.out.println(figure.leftHand);
    System.out.println(figure.rightHand);
    figure.swapHands();
    figure.wearHat(sombrero);
    figure.placeInLeftHand(null);
    figure.placeInRightHand(item2);
    System.out.println(figure.name);
    System.out.println(figure.hat);
    System.out.println(figure.leftHand);
    System.out.println(figure.rightHand);
  }

}
