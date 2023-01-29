/*
    Artes, Francesca Q.
    BSCpE 1-1
    
    This program calculates your Body Mass Index (BMI) and show its interpretation.

	C++
*/

#include <iostream>
#include <cmath>
using namespace std;

double bmiCalculatoion(double weight, double height);
string bmiInterpret(double bmi);

int main()
{
    double bmi, height, weight;
    string interpretation;
    
    cout << "This program calculates your Body Mass Index (BMI) and show its interpretation." << endl;
    cout << " " << endl;
    cout << "What is your weight in pounds? ";
    cin >> weight;
    cout << "What is your height in inches? ";
    cin >> height;
    bmi = round(bmiCalculatoion(weight, height)*100.0)/100.0;
    interpretation = bmiInterpret(bmi);
    cout << "Your Body Mass Index is " << bmi << ". " << interpretation;
    return 0;
}
double bmiCalculatoion(double weight, double height)
{
    int constant = 703;
    double bmi = (weight * constant/pow(height, 2));
    return bmi;
}
string bmiInterpret(double bmi)
{
    if (bmi < 18.5) {return "You are Underweight.";}
    else if (bmi >= 18.5 & bmi <= 24.9) {return "You are in Optimal Weight.";}
    else if (bmi >= 25 & bmi <= 29.9) {return "You are Overweight.";}
    else if (bmi >= 30) {return "You are Obese.";}
    return "";
}