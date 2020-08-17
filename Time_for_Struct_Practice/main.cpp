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

// add hours and minutes to Time passed in
void addHoursAndMinutes (int hrs, int mins, Time &current) {
  if (current.minute + mins >= 60) {
    if (current.minute + mins < 120){
      current.hour++;
    } else {
      current.hour += mins/60;
    }
    current.minute = (current.minute + mins) % 60;
  } else {
    current.minute += mins;
  }

  if (current.hour < 12 && current.hour + hrs >= 12) {
    if (current.timeOfDay.compare("AM") == 0) { // time of day is AM
      current.timeOfDay = "PM";
    } else {
      current.timeOfDay = "AM";
    }
  }

  if (current.hour + hrs > 12) {
    current.hour = (current.hour + hrs) % 12;
  } else {
    current.hour += hrs;
  }
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
  Time test1 = {"AM", 3, 59, 01};
  Time test2 = {"PM", 8, 13, 59};
  Time test3 = {"AM", 5, 50, 43};
  Time test4 = {"AM", 12, 00, 05};

  cout << "Test 1\nBefore\n" << formattedTime(test1) << endl;
  addHoursAndMinutes(6,10,test1);
  cout << "After\n" << formattedTime(test1) << endl;

  cout << "\nTest 2\nBefore\n" << formattedTime(test2) << endl;
  addHoursAndMinutes(6,10,test2);
  cout << "After\n" << formattedTime(test2) << endl;

  cout << "\nTest 3\nBefore\n" << formattedTime(test3) << endl;
  addHoursAndMinutes(6,10,test3);
  cout << "After\n" << formattedTime(test3) << endl;

  cout << "\nTest 4\nBefore\n" << formattedTime(test4) << endl;
  addHoursAndMinutes(2,240,test4);
  cout << "After\n" << formattedTime(test4) << endl;

  return 0;
}
