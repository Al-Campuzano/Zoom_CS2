#include <iostream>

using namespace std;

struct soda
{
  int gramsOfSugar;
  float gramsOfCarbonation;
};

int main() {
  soda **sodaArray = new soda*[3];

  sodaArray[0] = new soda;
  sodaArray[0]->gramsOfSugar = 20;
  sodaArray[0]->gramsOfCarbonation = 30.25;

  sodaArray[1] = new soda;
  sodaArray[1]->gramsOfSugar = 42;
  sodaArray[1]->gramsOfCarbonation = 52.03;

  sodaArray[2] = new soda;
  sodaArray[2]->gramsOfSugar = 33;
  sodaArray[2]->gramsOfCarbonation = 33.33;

  // print out values then clean up the memory
  for (int i = 0; i < 3; i++) {
    cout << "\nSoda #" << i+1 << ": \n";
    cout << "Grams of sugar: " << sodaArray[i]->gramsOfSugar << endl;
    cout << "Grams of carbonation: " << sodaArray[i]->gramsOfCarbonation << endl;
    delete sodaArray[i];
  }

  delete [] sodaArray;

  return 0;
}
