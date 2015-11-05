#include <iostream>

using namespace std;

int sumEvenFibonacci(int max) {
	int sum = 0, a = 0, b = 1, c;
	for(int i = 0; b < max; i++) {
		c = a;
		a = b;
		b += c;
		if(b % 2 == 0)
			sum += b;
	}
	return sum;
}

int main() {
	cout << sumEvenFibonacci(4000000) << endl;
	return 0;
}