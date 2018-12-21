#include <iostream>

using namespace std;

int smallestDivisible(int min, int max) {
	for(int n = max; ; n++) {
		bool flag = true;
		for(int i = min; i <= max; i++) {
			if(n % i != 0) {
				flag = false;
				break;
			}
		}
		if(flag)
			return n;
	}
	return 0;
}

int main() {
	cout << smallestDivisible(1, 20) << endl;
	return 0;
}