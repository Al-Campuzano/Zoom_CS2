public class LegoMinifigure {
  String name;
  LegoHat hat;
  LegoItem leftHand;
  LegoItem rightHand;

  public LegoMinifigure(String newName, LegoHat newHat, LegoItem left, LegoItem right) {
    name = newName;
    hat = newHat;
    leftHand = left;
    rightHand = right;
  }
}
