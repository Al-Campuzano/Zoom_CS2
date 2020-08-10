// Define a struct representing a time. It should include a string representing “AM” or “PM”,
// and ints representing the hour, minute, and second.
//
// Write two useful functions of your own design. One function will take a reference to
// your time struct as its parameter, and perform a useful operation on the struct that
// changes the value of at least one of its members. The second function will act as a black box:
// it will take as parameters one or more time structs that are passed by value (not by reference),
// and it will return a value.
//
// Demonstrate the use of these functions by creating an example instance of the struct in main()
// and outputting the relevant information before and after calling the functions.

#include <iostream>
#include <string>

using namespace std;

struct Time {
  string timeOfDay;
  int hour, minute, second;
};

void addSixHoursAndTenMinutes (Time &current) {
  current.hour += 6;
  current.minute += 10;
}

// "blackbox" function to return string of formatted time
string formattedTime (Time current) {
  // if the hour minute or seconds are less than ten then append the 0 in front
  string hour = current.hour < 10 ? "0" + to_string(current.hour) : to_string(current.hour);
  string minute = current.minute < 10 ? "0" + to_string(current.minute) : to_string(current.minute);
  string second = current.second < 10 ? "0" + to_string(current.second) : to_string(current.second);
  return hour + ":" + minute + ":" + second + " " + current.timeOfDay;
}

int main() {
  Time test = {"AM", 3, 59, 01};
  // before
  cout << formattedTime(test) << endl;

  // after
  addSixHoursAndTenMinutes(test);
  cout << formattedTime(test) << endl;

  return 0;
}
