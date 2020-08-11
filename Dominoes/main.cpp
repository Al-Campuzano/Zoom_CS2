#include <iostream>

using namespace std;

struct domino {
  short int sideA;
  short int sideB;
};

int main() {
  // short int test = 6;
  // cout << " Dominoes " << sizeof(test);
  const short int MAX_PIPS = 6; // size of highest domino piece
  const short int TILES_NUM = (MAX_PIPS + 1) * (MAX_PIPS + 2)/2; // a double six set of dominoes has 28 tiles
  domino set[TILES_NUM];

  int index = 0;
  for (int a = 0; a < MAX_PIPS; a++) {
    for (int b = a; b < MAX_PIPS; b++) {
      set[index].sideA = a;
      set[index].sideB = b;
      index++;
    }
  }

  return 0;
}
