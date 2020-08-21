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

  public String toString() {
    return "TODO";
  }

  public void swapHands() {
    LegoItem temp = leftHand;
    leftHand = rightHand;
    rightHand = temp;
  }

  public void wearHat(LegoHat hat) {
    this.hat = hat;
  }

  public void placeInLeftHand(LegoItem item) {
    leftHand = item;
  }

  public void placeInRightHand(LegoItem item) {
    rightHand = item;
  }

  public boolean isGood(String season, float threshold) {

    return true;
  }
}
