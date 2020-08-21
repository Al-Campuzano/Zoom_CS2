public class LegoItem {
  String name;
  float weight;

  public LegoItem(String newName, float newWeight) {
    name = newName;
    weight = newWeight;
  }

  public String toString() {
    return "a " + weight + "-gram " + name;
  }

  public boolean isHeavy(float threshold) {
    return weight > threshold;
  }

}
