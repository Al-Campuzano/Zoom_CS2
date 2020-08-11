#include <iostream>
#include <string>

using namespace std;

struct domino {
  short int sideA;
  short int sideB;
};

// print entire dominoes set
template <typename T>
void printSet (const T &set, short int numOfTiles) {
  string lines[5] = {
    "|   |\n",
    "|*  |\n",
    "| * |\n",
    "|  *|\n",
    "|* *|\n"
  };

  string tiles[7] = {
    lines[0] + lines[0] + lines[0],
    lines[0] + lines[2] + lines[0],
    lines[1] + lines[0] + lines[3],
    lines[1] + lines[2] + lines[3],
    lines[4] + lines[0] + lines[4],
    lines[4] + lines[2] + lines[4],
    lines[4] + lines[4] + lines[4]
  };

  string horizontalLine = " --- \n";

  for (int i = 0; i < numOfTiles; i++) {
    cout << horizontalLine;
    cout << tiles[set[i].sideA];
    cout << horizontalLine;
    cout << tiles[set[i].sideB];
    cout << horizontalLine;
    cout << endl;
  }
}

// Descending sorting by side B using selection sort
template <typename T>
void sortBySideBDesc (T &set, short int numOfTiles) {
  int startIndex = 0;
  while (startIndex < numOfTiles - 1) {
    int innerIndex = startIndex + 1;
    int lowestIndex = startIndex;
    while (innerIndex < numOfTiles) {
      if (set[innerIndex].sideB >= set[lowestIndex].sideB) {
        lowestIndex = innerIndex;
      }
      innerIndex++;
    }
    if (lowestIndex != startIndex) {
      domino temp = set[startIndex];
      set[startIndex] = set[lowestIndex];
      set[lowestIndex] = temp;
    }
    startIndex++;
  }
}

int main() {
  const short int MAX_PIPS = 6; // size of highest domino piece
  const short int TILES_NUM = (MAX_PIPS + 1) * (MAX_PIPS + 2)/2; // a double six set of dominoes has 28 tiles
  domino set[TILES_NUM];

  int index = 0;
  for (int a = 0; a <= MAX_PIPS; a++) {
    for (int b = a; b <= MAX_PIPS; b++) {
      set[index].sideA = a;
      set[index].sideB = b;
      index++;
    }
  }

  printSet(set, TILES_NUM);
  cout << "\n######Re-sorted descending by second side (B)########\n";
  sortBySideBDesc(set, TILES_NUM);
  printSet(set, TILES_NUM);

  return 0;
}
