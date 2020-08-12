// 1. Write code that will use cin.get() to read characters in one by one until a
// newline is encountered. Report how many words there were in the input,
// how long the longest word was, and the largest number of vowels in a word
// (work on one of these at a time!). You may not store any of the characters but
// you can have other variables that store information about them as you go along.
//
// 2. Think about all potential cases. What types of input could break your program?
// What if someone presses enter right away? What if there’s only one word?
// What if there are many words? What if there are multiple spaces between words? etc…
// Make sure it all works.

#include <iostream>

using namespace std;

int main() {
  char letter;
  int words = 0, wordLengthTemp = 0, longWordLength = 0, vowelsTemp = 0, mostVowels = 0;
  cout << "Type something: ";

  do {
    letter = cin.get();

    // add to vowel count
    switch (letter) {
      case 'A':
      case 'a':
      case 'E':
      case 'e':
      case 'I':
      case 'i':
      case 'O':
      case 'o':
      case 'U':
      case 'u':
        vowelsTemp++;
        break;
    }

    // if end of word or end of line check word, letters and vowels counts
    if (letter == ' ' || letter == '\n') {
      // this prevents counting a word if the first character entered is a newline or space
      // as well as if two or more spaces in a row are entered
      if (wordLengthTemp != 0) {
        words++;
      }
      // check if this word is longer than longest so far
      if (wordLengthTemp > longWordLength) {
        longWordLength = wordLengthTemp;
      }
      // check if this word has most vowels
      if (vowelsTemp > mostVowels) {
        mostVowels = vowelsTemp;
      }
      // reset word length and vowels temporary counters
      vowelsTemp = 0;
      wordLengthTemp = 0;
    // otherwise if not a symbol add to temp letter count
    } else if ((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z')){
      wordLengthTemp++;
    }
} while (letter != '\n');

  cout << "Total words: " << words << endl;
  cout << "Longest word length: " << longWordLength << endl;
  cout << "Most vowels amount: " << mostVowels << endl;

  return 0;
}
