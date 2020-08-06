#include <iostream>

using namespace std;

// print char "c" "n" times
void printChar(char c, int n) {
  for (int i = 0; i < n; i++) {
    cout << c;
  }
}

int main() {
  int height; // has to be even number to be symmetrical
  cout << "Enter an even number and press enter: ";
  cin >> height;

  if (height % 2 == 0) {
    // This prints the top half of the shape
    for (int i = 0; i < height/2; i++) {
      printChar(' ', i);
      printChar('#', i+1);
      if (i == height/2 - 1) {
        printChar('#', 1);
      }
      printChar(' ', (height-2)-(i*2));
      printChar(' ', (height-2)-(i*2));
      printChar('#', i+1);
      cout << '\n';
    }

    // This prints the bottom half of the shape
    for (int i = height/2; i < height; i++) {
      printChar(' ', height - (i+1));
      printChar('#', height - i);
      if (i == height/2) {
        printChar('#', 1);
      }
      printChar(' ', i * 2 - height);
      printChar(' ', i * 2 - height);
      printChar('#', height - i);
      cout << '\n';
    }
  } else {
    cout << "That is not an even number. Ending program";
  }

  return 0;
}
