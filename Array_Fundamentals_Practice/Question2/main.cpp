// Write a C++ program that defines a constant (fixed) array of at least 10 characters.
// This must be an array of char, not a string type.
// Loop through the array and count how many characters are uppercase.
// Demonstrate that your code works correctly in main().

#include <iostream>

using namespace std;

int countUpperChars(const char array[], int numItems) {
  int upperCount = 0;

  for (int i = 0; i < numItems; i++) {
    if (array[i] >= 'A' && array[i] <= 'Z'){
      upperCount++;
    }
  }

  return upperCount;
}

int main() {
  const int ARRAY_SIZE = 10;
  const char testArray1[ARRAY_SIZE] = {'a', 'a', 'h', 'e', 'l', 'l', 'o', '!', 'z', '2'};
  const char testArray2[ARRAY_SIZE] = {};
  const char testArray3[ARRAY_SIZE] = {'A', 'A', 'H', 'E', 'L', 'L', 'O', 'I', 'Z', 'S'};
  const char testArray4[ARRAY_SIZE] = {'A', 'a', 'H', 'e', 'l', 'l', 'o', '!', 'Z', '2'};

  cout << "testArray1 has " << countUpperChars(testArray1, ARRAY_SIZE) << " uppercase characters\n";
  cout << "testArray2 has " << countUpperChars(testArray2, ARRAY_SIZE) << " uppercase characters\n";
  cout << "testArray3 has " << countUpperChars(testArray3, ARRAY_SIZE) << " uppercase characters\n";
  cout << "testArray4 has " << countUpperChars(testArray4, ARRAY_SIZE) << " uppercase characters\n";

  return 0;
}
