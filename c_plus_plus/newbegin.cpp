#include <iostream>
#include <vector>
#define REP(i, a, b) for (int i = a; i <= b; i++)


using namespace std;

int main() {
	string s;
	vector<int> arr; 
    for(int i = 0; i < 10; ++i) {
        arr.push_back(i);
        cout << "adding " << i << "\n";
    }
	getline(cin, s);
    cout << "seize of vector is: " << arr.size() << "\n";
    for(int& v: arr) {
        cout << v << "\n";
    }
	cout << "welcome to this world!!!!";
    cout << s;

	return 0;
}
