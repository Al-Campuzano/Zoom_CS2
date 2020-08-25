#include <iostream>
using namespace std;

/*
 * Removing the checks for NULL causes a segmentation fault error once the
 * program tries to access the value of the NULL pointer.
 * This error is thrown because that pointer does not have access to any part of
 * memory that we can safely use since no memory address has been assigned to it. 
 */
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
