#include <iostream>
#include <string.h>

using namespace std;

class flower {
  public:
    string color;
    int height;
    float percentWater;

  flower(string newColor, int newHeight, float newPercent) {
    color = newColor;
    height = newHeight;
    percentWater = newPercent;
  }

  void printFlower() {
    cout << color << " (" << height << " cm, "
         << percentWater << "% water)" << endl;
  }

  void growFlower() {
    height += 2;
    percentWater -= 0.05f;
  }

  void waterFlower() {
    percentWater += 0.1f;
  }
};

int main() {
  flower f("purple", 10, 0.5f);

  f.printFlower();

  f.waterFlower();

  f.printFlower();

  f.growFlower();

  f.printFlower();

  return 0;
}
