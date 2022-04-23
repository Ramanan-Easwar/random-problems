#include <iostream>
#define ll long long

int main() {
	int t;
	std::cin >> t;
	while(t--) {
		ll a, b, diff;
		std::cin >> a >> b;
		diff = a - b;
		if(diff == 0)
			std::cout << "0\n";
		else if(((diff > 0) && (diff % 2 == 0)) || ((diff < 0) && (diff % 2 !=0)))
			std::cout << "1\n";
		else
			std::cout << "2\n";
	}
	return 0;
}
