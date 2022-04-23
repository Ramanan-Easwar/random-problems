#include <iostream>
#define ll long long

ll Dig(ll n) {
	ll temp, m = -1, M = 10;
	while(n > 0) {
		temp = n % 10;
		if(temp > m) {
			m = temp;
		}
		if(temp < M) { 
			M = temp;
		}
		n /= 10;
	}
	return m * M;
}

int main() {
	int t;
	std::cin >> t;
	while(t--) {
		ll a, K, temp;
		std::cin >> a >> K;
		K--;
        while(i < k) {
            cout << "hey!!";
        }
		while(K--) {
			ll temp = Dig(a);
			if(temp == 0) break;
			a += temp;
		}
		std::cout << a << "\n";
	}
	return 0;
}
