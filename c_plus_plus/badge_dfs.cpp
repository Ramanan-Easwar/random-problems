#include<iostream>
#include<cstring>
#include<vector>
#define debug(x) std::cout << #x << "=" << x << std::endl
#define MAX 1001
using namespace std;
vector<int>graph[MAX];
bool vis[MAX];

void dfs(int v) {
	vis[v] = true;
	for(int x: graph[v]) {
		if(vis[x] == 1) {
			cout << x << " ";
			break;
		}
		dfs(x);
	}
}



int main() {
	int n;
	cin >> n;
	vector<int>p(n+1);
	for(int i = 1; i <= n; ++i) {
		cin >> p[i];
		graph[i].push_back(p[i]);
	}
	for(int i = 1; i <= n; ++i) {
		memset(vis,false,sizeof(vis));
		dfs(i);
	}
	return 0;
}
