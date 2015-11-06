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

int prime(int n) {
	int currentPrimes = 0;
	int i = 1;
	while(currentPrimes < n) {
		if(primeNum(++i))
			currentPrimes++;
	}
	return i;
}

int main() {
	cout << prime(10001) << endl;
	return 0;
}