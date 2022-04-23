#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
	int n, m, pairs = 0;
	cin >> n;
	vector<int> b(n);
	for(int i = 0; i < n; ++i)
		cin >> b[i];
	cin >> m;
	vector<int> g(m);
	for(int i = 0; i < m; ++i)
		cin >> g[i];
	sort(g.begin(), g.end());
	sort(b.begin(), b.end());
	for(int i = 0; i < n; ++i) {
		for(int j = 0; j < m; ++j) {
			if(abs(b[i] - g[j]) <= 1) {
				pairs++;
				g[j] = 999;
				break;
			} 
		}
	}
	cout << pairs;
	return 0;
}

