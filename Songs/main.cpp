#include <iostream>
#include <string>
#include <sstream>

using namespace std;

struct song {
  string title;
  string artist;
  int year;
};

string songToString(song s);
song** songsFromYear(song **songs, int size, int year, int* resultSize);

int main() {

  const int ARRAY_SIZE = 5;
  song **songsArray = new song*[ARRAY_SIZE];

  songsArray[0] = new song;
  songsArray[0]->title = "La Villa Strangiato";
  songsArray[0]->artist = "Rush";
  songsArray[0]->year = 1978;

  songsArray[1] = new song;
  songsArray[1]->title = "Televators";
  songsArray[1]->artist = "The Mars Volta";
  songsArray[1]->year = 2003;

  songsArray[2] = new song;
  songsArray[2]->title = "The Crowing";
  songsArray[2]->artist = "Coheed and Cambria";
  songsArray[2]->year = 2003;

  songsArray[3] = new song;
  songsArray[3]->title = "Relayer";
  songsArray[3]->artist = "Yes";
  songsArray[3]->year = 1974;

  songsArray[4] = new song;
  songsArray[4]->title = "Nothingface";
  songsArray[4]->artist = "Voivod";
  songsArray[4]->year = 1989;

  // test songToString function
  for (int i = 0; i < ARRAY_SIZE; i++) {
    cout << songToString(*songsArray[i]) << endl;
  }

  int year = 2003;
  int *resultSize = new int;
  *resultSize = 0;

  song **arrayFromYear = songsFromYear(songsArray, ARRAY_SIZE, year, resultSize);

  // change message depending on if there are any matches
  if (*resultSize > 0) {
    cout << "\nPrinting songs from " << year << ":\n";
  } else {
    cout << "\nThere are no songs from " << year << ".\n";
  }

  // print results
  for (int i = 0; i < *resultSize; i++) {
    cout << songToString(*arrayFromYear[i]) << endl;
  }

  // clean up memory
  for (int i = 0; i < ARRAY_SIZE; i++) {
    delete songsArray[i];
  }
  delete [] songsArray;
  delete resultSize;
  delete [] arrayFromYear;

  return 0;
}

string songToString(song s) {
  // using stringstream to convert int to string
  stringstream ss;
  ss << s.year;
  string year;
  ss >> year;

  return s.artist + " - " + s.title + " (" + year + ")";
}

song** songsFromYear(song **songs, int size, int year, int* resultSize) {
  for (int i = 0; i < size; i++) {
    if(songs[i]->year == year) {
      *resultSize += 1;
    }
  }
  // if found more than more result
  if (*resultSize > 0) {
    song** results = new song*[*resultSize];
    int counter = 0;
    for (int i = 0; i < size; i++) {
      if(songs[i]->year == year) {
        results[counter] = songs[i];
        counter++;
      }
    }
    return results;
  }
  return NULL; // otherwise return null
}
