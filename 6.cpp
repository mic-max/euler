#include <iostream>

using namespace std;

int squareOfSums(int max) {
	int sum = 0;
	for(int i = 1; i <= max; i++)
		sum += i;
	return sum * sum;
}

int sumSquareDifference(int n) {
	int sum = 0;
	for(int i = 1; i <= n; i++)
		sum += i * i;
	return squareOfSums(n) - sum;
}

int main() {
	cout << sumSquareDifference(100) << endl;
	return 0;
}