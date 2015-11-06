#include <iostream>
#include <string>

using namespace std;

long largestProductInSeries(string n, int v) {
	long max = 0;
	for(int i = 0; i <= n.length() - v; i++) {
		long sum = 1;
		for(int j = i; j < i + v; j++)
			sum *= n.at(j) - '0';
		if(sum > max)
			max = sum;
	}
	return max;
}

int main() {
	string n;
	cin >> n;
	cout << largestProductInSeries(n, 13) << endl;
	return 0;
}