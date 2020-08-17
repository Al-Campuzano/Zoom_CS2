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
  // song test = {"One", "Coheed", 2010};
  // cout << songToString(test);
  song **songsArray = new song*[5];

  songsArray[0] = new song;
  songsArray[0]->title = "La Villa Strangiato";
  songsArray[0]->artist = "Rush";
  songsArray[0]->year = 1978;

  songsArray[1] = new song;
  songsArray[1]->title = "La Villa Strangiato";
  songsArray[1]->artist = "Rush";
  songsArray[1]->year = 1978;

  songsArray[2] = new song;
  songsArray[2]->title = "La Villa Strangiato";
  songsArray[2]->artist = "Rush";
  songsArray[2]->year = 1978;

  songsArray[3] = new song;
  songsArray[3]->title = "La Villa Strangiato";
  songsArray[3]->artist = "Rush";
  songsArray[3]->year = 1978;

  songsArray[4] = new song;
  songsArray[4]->title = "La Villa Strangiato";
  songsArray[4]->artist = "Rush";
  songsArray[4]->year = 1978;

  return 0;
}

string songToString(song s) {
  stringstream ss;
  ss << s.year;

  string year;
  ss >> year;

  return s.artist + " - " + s.title + " (" + year + ")";
}
