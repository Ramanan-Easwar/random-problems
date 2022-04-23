#include <iostream>
#define ll long long

int main() {
	ll n, key_count = 0, buff[26] = {0};
	std::cin >> n;
	n--;
	char key, door;
	while(n--) {
		std::cin >> key;
		std::cin >> door;
		buff[key - 'a']++;
		if(buff[door - 'A'] == 0)
			key_count++;
		else 
			buff[door - 'A']--;
	}
	std::cout << key_count << std::endl;
	return 0;
}
