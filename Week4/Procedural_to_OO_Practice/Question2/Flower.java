public class Flower {
  String color;
  int height;
  float percentWater;

  public Flower (String c, int h, float p) {
    color = c;
    height = h;
    percentWater = p;
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
