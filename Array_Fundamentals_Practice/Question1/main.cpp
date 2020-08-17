#include <iostream>

using namespace std;

bool isSorted(int array[], int numItems) {
  bool sorted = true;

  for (int i = 1; i < numItems; i++) {
    if (array[i] < array[i-1]) {
      sorted = false;
    }
  }

  return sorted;
}

int main() {
  const int TEST_ARRAY_1_SIZE = 7;
  const int TEST_ARRAY_2_SIZE = 1;

  int testArray1[TEST_ARRAY_1_SIZE] = {4, 2, 4, 5, 6, 7, 8}; // false
  int testArray2[TEST_ARRAY_1_SIZE] = {1, 2, 4, 5, 6, 7, 8}; // true
  int testArray3[TEST_ARRAY_1_SIZE] = {1, 2, 4, 5, 6, 7, 3}; // false
  int testArray4[TEST_ARRAY_1_SIZE] = {2, 2, 4, 5, 6, 7, 10}; // true
  int testArray5[TEST_ARRAY_1_SIZE] = {8, 7, 6, 5, 4, 3, 2}; // false
  int testArray6[TEST_ARRAY_2_SIZE] = {3}; // true
  int testArray7[TEST_ARRAY_1_SIZE]; // result might be unexpected since array is not initialized

  cout << "For test 1 isSorted returned " << isSorted(testArray1, TEST_ARRAY_1_SIZE) << endl;
  cout << "For test 2 isSorted returned " << isSorted(testArray2, TEST_ARRAY_1_SIZE) << endl;
  cout << "For test 3 isSorted returned " << isSorted(testArray3, TEST_ARRAY_1_SIZE) << endl;
  cout << "For test 4 isSorted returned " << isSorted(testArray4, TEST_ARRAY_1_SIZE) << endl;
  cout << "For test 5 isSorted returned " << isSorted(testArray5, TEST_ARRAY_1_SIZE) << endl;
  cout << "For test 6 isSorted returned " << isSorted(testArray6, TEST_ARRAY_2_SIZE) << endl;
  cout << "For test 7 isSorted returned " << isSorted(testArray7, TEST_ARRAY_1_SIZE) << endl;

  return 0;
}
