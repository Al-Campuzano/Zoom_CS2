public class Flower {
  String color;
  int height;
  float percentWater;

  public Flower (String newColor, int newHeight, float newPercent) {
    color = newColor;
    height = newHeight;
    percentWater = newPercent;
  }

  public void printFlower() {
    System.out.println(color + " (" + height + " cm, "
                      + percentWater + "% water)");
  }

  public void growFlower() {
    height += 2;
    percentWater -= 0.05;
  }

  public void waterFlower() {
    percentWater += 0.1;
  }
}
