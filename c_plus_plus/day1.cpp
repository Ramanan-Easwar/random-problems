#include<iostream>
#define ll long long
int main(){
	ll n,k;
	std::cin >> n >> k;
	while(k--){
		if( n % 10 ==0 )
			n /= 10;
		else
			n -= 1;		
	}
	std::cout << n;
	return 0;
}
