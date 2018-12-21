#include <iostream>
#include <string>
#include <cmath>

using namespace std;

string reverse(string s) {
	string temp = "";
	for(int i = s.length() - 1; i >= 0; i--)
		temp += s.at(i);
	return temp;
}

int largestPalindrome(int min, int max) {
	int n = 0;
	for(int i = max; i >= min; i--) {
		for(int j = i; j >= min; j--) {
			string s = to_string(i * j);
			if(i * j > n && s.compare(reverse(s)) == 0)
				n = i * j;
		}
	}
	return n;
}

int main() {
	cout << largestPalindrome(100, 999) << endl;
	return 0;
}