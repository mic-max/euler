#include <iostream>
#include <cmath>

using namespace std;

bool primeNum(int n) {
	for(int i = 2; i <= sqrt(n); i++) {
		if(n % i == 0)
			return false;
	}
	return true;
}

long sumPrimeNumbers(int max) {
	long sum = 0;
	for(int i = 2; i < max; i++) {
		if(primeNum(i))
			sum += i;
	}
	return sum;
}

int main() {
	cout << sumPrimeNumbers(2000000) << endl;
	return 0;
}