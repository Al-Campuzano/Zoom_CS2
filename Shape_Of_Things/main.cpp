#include <iostream>

using namespace std;

void printChar(char c, int n) {
  for (int i = 0; i < n; i++) {
    cout << c;
  }
}

int main(){

  for (int i = 0; i < 5; i++) {
    printChar(' ', i);
    printChar('#', i+1);
    printChar(' ', 9-(i*2+1));
    printChar(' ', 9-(i*2+1));
    printChar('#', i+1);
    cout << '\n';
  }

  return 0;
}
