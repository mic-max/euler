#include <iostream>

using namespace std;

int pythagoreanTriplet(int n) {
	for(int i = 1; i < n; i++) {
		for(int j = 1; j < n - i; j++) {
			int k = n - i -j;
			if(i * i + j * j == k * k)
				return i * j * k;
		}
	}
	return 0;
}

int main() {
	cout << pythagoreanTriplet(1000) << endl;
	return 0;
}