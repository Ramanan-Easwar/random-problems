#include <iostream>
#include <map>
#include <string>

int main() {
	int t;
	std::cin >> t;
	std::map<std::string, int> db; 
	while(t--) {
		std::string name;
		std::cin >> name;
		if(!db[name]){
			db[name] = 1;
			std::cout << "OK\n";
		}
		else {
			db[name]++;
			std::cout << name << db[name] - 1 << "\n";
		}
	}
	return 0;
}
