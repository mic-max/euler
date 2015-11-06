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

int largestPrimeFactor(long n) {
	for(int i = sqrt(n); i > 0; i--) {
		if(n % i == 0 && primeNum(i))
			return i;
	}
	return 0;
}

int main() {
	cout << largestPrimeFactor(600851475143) << endl;
	return 0;
}