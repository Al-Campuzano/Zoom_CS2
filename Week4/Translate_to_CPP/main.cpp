#include <iostream>

using namespace std;

float getAverageScore(int scoreArray[], int length) {
  float total = 0.0;

  for (size_t i = 0; i < length; i++) {
    total += scoreArray[i];
  }

  return total / length;
}

int main() {
  const int ARRAY_SIZE = 10;
  // initializing all elements to zero to avoid having any garbage values
  int scores[ARRAY_SIZE] = {0};

  for (size_t i = 0; i < ARRAY_SIZE; i+=2) {
    scores[i] = i;
  }

  cout << "Average score: " << getAverageScore(scores, ARRAY_SIZE);
  return 0;
}
