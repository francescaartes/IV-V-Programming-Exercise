/*
    Artes, Francesca Q.
    BSCpE 1-1
    
    This program calcuates the Distance Traveled in each hour of the time period.

	C++
*/

#include <iostream>
using namespace std;

void showDistanceTraveled(int speed, int time);

int main()
{
   int speed, time;

    cout << "This program calcuates the Distance Traveled in each hour of the time period." << endl;
    cout << " " << endl;

    cout << "What is the speed of your vehicle in mph? ";
    cin >> speed;
    cout << "How many hours did you traveled? ";
    cin >> time;
    
    cout << " " << endl;
    showDistanceTraveled(speed, time);
    
    return 0;
}

void showDistanceTraveled(int speed, int time) {
    cout << "Hour\t\tDistance Traveled" << endl;
    cout << "---------------------------------" << endl;
    for (int hours = 0; hours < time; hours++) {
            int distance = speed * (hours+1);
            cout << (hours+1) <<  "\t\t" <<  distance << endl;
    }
}