#include <iostream>

int main() {
	int m, n;
	std::cin >> m >> n;
	bool result[m][n],a[m][n];
	for(int i = 0; i < m; ++i)
		for(int j = 0; j < n; ++j)
			result[i][j] = 1;
	for(int i = 0; i < m; ++i) {
		for(int j = 0; j < n; ++j) {
			std::cin >> a[i][j];
			if(!a[i][j]) {
				for(int l = 0; l < n; ++l)
					result[i][l] = 0;
				for(int l = 0; l < m; ++l)
					result[l][j] = 0;
			}
		}
	}
	for(int i = 0; i < m; ++i) {
		for(int j = 0; j < n; ++j) {
			int flag = 0;
			for(int l = 0; l < n; ++l)
				flag |= result[i][l];
			for(int l = 0; l < m; ++l)
				flag |= result[l][j];
			if(flag != a[i][j]) {
				std::cout << "NO \n";
				return 0;
			}
		}
	}
	std::cout << "YES\n";
	for(int i = 0; i < m; ++i) {	
		for(int j = 0; j < n; ++j) {
			std::cout << result[i][j] << " ";
		}
		std::cout << "\n";
	}
	return 0;
}
