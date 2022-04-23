#include <iostream>
#define max(a, b) ((a)>(b)?(a):(b))
using namespace std;
int main() {
	int t;
	cin >> t;
	while(t--) {
		int a,b,s;
		cin >> a >> b;
		s = min(max(2*b, a), max(2*a, b));
		cout << s * s << endl;
	}
	return 0;
}
