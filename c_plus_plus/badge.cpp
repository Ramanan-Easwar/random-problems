#include<iostream>
#include<vector>
#define ll long long
#define debug(x) std::cout << #x << "=" << x << std::endl;

int main(){
	ll n;
	std::cin >> n;
	std::vector<ll>p(n);
	std::vector<ll>ans;
	for(int i = 0; i < n; ++i) {
		std::cin >> p[i];
	}
	for(int i = 0; i < n; ++i) {
		std::vector<int>buff(n,0);
		buff[i] += 1;
		int j = p[i] - 1;
		while(1) {
			buff[j] += 1;
			if(buff[j] == 2) {
				ans.push_back(j);					
				break;
			}
			j = p[j] - 1;
		}
	}
	for(ll x: ans) {
		std::cout << x + 1 << " ";
	}
	return 0;
}

