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
    boolean wearingHat = false;
    String leftString = "";
    String rightString = "";
    if (hat != null) {
      wearingHat = true;
    }
    int itemCount = 0;
    if (leftHand != null) {
      itemCount++;
      leftString = leftHand.toString() + " in the left hand";
    }
    if (rightHand != null) {
      itemCount++;
      rightString = rightHand.toString() + " in the right hand";
    }

    String result = "A Lego minifigure named " + name;
    if (wearingHat || itemCount > 0) {
      result += ", who is ";
    }
    if (wearingHat) {
      result += "wearing " + hat.toString();
    }
    if (itemCount > 0) {
      if (wearingHat) {
        result += " and is ";
      }
      result += "holding ";
      if (leftString != "") {
        result += leftString;
      }
      if (itemCount == 2) {
        result += " and ";
      }
      if (rightString != "") {
        result += rightString;
      }
    }
    return result += ".\n";
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
    // true if wearing a hat that is at least 6 in style
    // and the figure either has no items in its hand or the item(s) are under
    // the threshold
    return (hat != null && hat.computeStyle(season) >= 6
           && !(leftHand != null && leftHand.isHeavy(threshold)
           || rightHand != null && rightHand.isHeavy(threshold)));
  }
}
