#include <iostream>

using namespace std;

void printChar(char c, int n) {
  for (int i = 0; i < n; i++) {
    cout << c;
  }
}

int main(){
  int height = 10;

// This prints the top half of the shape
  for (int i = 0; i < height/2; i++) {
    printChar(' ', i);
    printChar('#', i+1);
    printChar(' ', 8-(i*2));
    printChar(' ', 8-(i*2));
    printChar('#', i+1);
    cout << '\n';
  }

// This prints the bottom half of the shape
  for (int i = height/2; i < height; i++) {
    printChar(' ', height - (i+1));
    printChar('#', height - i);
    printChar(' ', i * 2 - height);
    printChar(' ', i * 2 - height);
    printChar('#', height - i);
    cout << '\n';
  }

  return 0;
}
