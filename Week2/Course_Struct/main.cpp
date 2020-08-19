#include <iostream>
#include <string>

using namespace std;

struct course {
  string department_code;
  int number;
  string title;
};

int numCoursesInDepartment(course courseArray[], int numCourses, string department) {
  int total = 0;
  for (int i = 0; i < numCourses; i++) {
    if (courseArray[i].department_code.compare(department) == 0) {
      total++;
    }
  }
  return total;
}

int main() {
  const int ARRAY_SIZE = 10;
  course courseArray[ARRAY_SIZE] = {
    {"COMP", 1406, "Introduction to Computer Science II"},
    {"SCIF", 2112, "Masters of Science Fiction"},
    {"JAZZ", 1960, "John Coltrane Appreciation"},
    {"COMP", 1001, "Programming in Visual Basic"},
    {"ENGL", 9999, "Making Sense of Pronunciations"},
    {"JAZZ", 1970, "Miles Ahead"},
    {"COMP", 1608, "History of Flash"},
    {"SCIF", 2001, "The Legacy of Philip K Dick"},
    {"ENGL", 8888, "Modern \"English\""},
    {"ECON", 1984, "Cryptocurrencies and Privacy"}
  };

  cout << "Course struct:\n";
  cout << numCoursesInDepartment(courseArray, ARRAY_SIZE, "HIST") << endl; // 0
  cout << numCoursesInDepartment(courseArray, ARRAY_SIZE, "ECON") << endl; // 1
  cout << numCoursesInDepartment(courseArray, ARRAY_SIZE, "SCIF") << endl; // 2
  cout << numCoursesInDepartment(courseArray, ARRAY_SIZE, "COMP") << endl; // 3

  return 0;
}
