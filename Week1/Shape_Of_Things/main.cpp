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
      // left half of shape
      printChar(' ', i);
      printChar('#', i+1);
      // extra character in the middle
      if (i == height/2 - 1) {
        printChar('#', 1);
      } else { // otherwise add blanks plus one to compensate for extra character
        printChar(' ', (height-2)-(i*2) +1);
      }
      // right half of shape
      printChar(' ', (height-2)-(i*2));
      printChar('#', i+1);
      cout << '\n';
    }

    // This prints the bottom half of the shape
    for (int i = height/2; i < height; i++) {
      // left half of shape
      printChar(' ', height - (i+1));
      printChar('#', height - i);
      // extra character in the middle
      if (i == height/2) {
        printChar('#', 1);
      } else { // otherwise add blanks plus one to compensate for extra character
        printChar(' ', i * 2 - height + 1);
      }
      // right half of shape
      printChar(' ', i * 2 - height);
      printChar('#', height - i);
      cout << '\n';
    }
  } else {
    cout << "That is not an even number. Ending program";
  }

  return 0;
}
