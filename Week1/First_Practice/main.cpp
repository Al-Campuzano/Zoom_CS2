#include <iostream>

using namespace std;

// this function returns the Grade Point Average based on the
// percentage grade passed in.
// This acts like a black box because the user doesn't need to know
// how the conversion/calculation is made to use the function and get the result
double gradeToGpa(int grade) {

  if (grade < 84) {
    return -1.0;
  }

  switch(grade) {
    case 84:
    case 85:
    case 86:
      return 3.0;
      break;
    case 87:
    case 88:
    case 89:
      return 3.33;
      break;
    case 90:
    case 91:
    case 92:
    case 93:
      return 3.67;
      break;
    default:
      return 4.0;
  }
}

int main(){
  cout << gradeToGpa(88) << endl; // 3.33
  cout << gradeToGpa(99) << endl; // 4
  cout << gradeToGpa(85) << endl; // 3
  cout << gradeToGpa(68) << endl; // -1
  return 0;
}
