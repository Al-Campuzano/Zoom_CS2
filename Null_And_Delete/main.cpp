#include <iostream>
using namespace std;

int main()
{
  int * pointerArray[4];

  pointerArray[0] = new int;
  pointerArray[1] = new int;
  pointerArray[2] = NULL;
  pointerArray[3] = new int;

  *(pointerArray[0]) = 1;
  *(pointerArray[1]) = 10;
  *(pointerArray[3]) = 50;

  for (int i = 0; i < 4; i++) {
    if (pointerArray[i] != NULL) {
      cout << *(pointerArray[i]) << endl;
    }
  }

  for (int i = 0; i < sizeof(pointerArray)/sizeof(int*); i++) {
    if (pointerArray[i] != NULL) {
      delete pointerArray[i];
      pointerArray[i] = NULL;
    }
  }

  return 0;
}
