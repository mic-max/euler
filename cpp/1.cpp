#include <iostream>

using namespace std;

int sumOfMultiples(int a, int b, int max) {
	int sum = 0;
	for(int i = 0; i < max; i += a)
		sum += i;
	for(int i = 0; i < max; i += b)
		sum += i;
	for(int i = 0; i < max; i += a * b)
		sum -= i;
	return sum;
}

int main() {
	cout << sumOfMultiples(3, 5, 1000) << endl;
	return 0;
}