//RandomNumber.cpp
#include<iostream>
#include <algorithm>
#include <ctime>
using namespace std;

int main()
{
		int frequency1 = 0; // count of 1s rolled
		int frequency2 = 0; // count of 2s rolled
		int frequency3 = 0; // count of 3s rolled
		int frequency4 = 0; // count of 4s rolled
		int frequency5 = 0; // count of 5s rolled
		int frequency6 = 0; // count of 6s rolled
		int frequency7 = 0; // count of 6s rolled
		int frequency8 = 0; // count of 6s rolled
		int frequency9 = 0; // count of 6s rolled

		int number;
		srand(time(NULL));

		cout<<"Enter a number ";
		cin>>number; // obtain user input


		// tally counts for 6,000,000 
		for (number = 1; number <= 6000000; number++)
		{
			int face = rand() % 10 + 1; // number from 1 to 9

			// use face value 1-9 to determine which counter to increment
			switch (face)
			{
			case 1:
				++frequency1; // increment the 1s counter
				break;
			case 2:
				++frequency2; // increment the 2s counter
				break;
			case 3:
				++frequency3; // increment the 3s counter
				break;
			case 4:
				++frequency4; // increment the 4s counter
				break;
			case 5:
				++frequency5; // increment the 5s counter
				break;
			case 6:
				++frequency6; // increment the 6s counter
				break;
			case 7:
				++frequency7; // increment the 7s counter
				break;
			case 8:
				++frequency8; // increment the 8s counter
				break;
			case 9:
				++frequency9; // increment the 9s counter
				break;
			}
		}

		cout<<"Frequency "; // output headers
		cout << frequency2 << endl;
		system("pause");
} // end class 
