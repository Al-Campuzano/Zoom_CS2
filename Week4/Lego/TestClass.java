public class TestClass {

  public static void main(String[] args) {
    System.out.println("---\nTesting Hat");
    LegoHat bowler = new LegoHat("bowler", 8);
    System.out.println(bowler.toString());
    System.out.println("Style number is: " + bowler.computeStyle("fall"));

    LegoHat sombrero = new LegoHat("sombrero", 1);
    System.out.println(sombrero.toString());
    System.out.println("Style number is: " + sombrero.computeStyle("summer"));


    System.out.println("---\nTesting Item");
    LegoItem sword = new LegoItem("sword", 8.8f);
    System.out.println(sword.toString());
    System.out.println("Is it heavy? " + sword.isHeavy(10.1f));

    LegoItem shield = new LegoItem("shield", 15.0f);
    System.out.println(shield.toString());
    System.out.println("Is it heavy? " + shield.isHeavy(10.1f));


    System.out.println("---\nTesting LegoMinifigure");
    LegoMinifigure figure = new LegoMinifigure("Al", null, null, null);
    System.out.println(figure.toString());
    figure.wearHat(sombrero);
    System.out.println(figure.toString());
    figure.placeInLeftHand(sword);
    System.out.println(figure.toString());
    figure.placeInRightHand(shield);
    System.out.println(figure.toString());
    System.out.println("Testing isGood method: " + figure.isGood("fall", 20));
    figure.swapHands();
    System.out.println(figure.toString());
    figure.wearHat(bowler);
    System.out.println(figure.toString());
    figure.wearHat(null);
    System.out.println(figure.toString());
    figure.placeInLeftHand(null);
    System.out.println(figure.toString());
    System.out.println("Testing isGood method: " + figure.isGood("fall", 10));

    // System.out.println(figure.isGood("fall", 10));

  }

}
