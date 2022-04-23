#include<iostream>
#include<vector>
#define debug(x) cout << #x << "=" << x << "\n";
#define MAX(a, b) ((a) > (b)? (a) : (b))
std::vector<int> graph[2001];
int maxLevel = -1;

void dfs(int node, int level) {
    maxLevel = MAX(maxLevel, level);
    for(int n: graph[node]) {
        dfs(n, level + 1);
    }
}

int main () {
    int i, t;
    std::cin >> t;
    i = 0;
    while(t--) {
        int val;
        std::cin >> val;
        if(val == -1)
            val = 0;
        graph[val].push_back(++i);
    }

    for(int i = 0; i < graph[0].size(); ++i) {
           dfs(graph[0][i], 1); 
    }
    std::cout << maxLevel; 
    return 0;
}

