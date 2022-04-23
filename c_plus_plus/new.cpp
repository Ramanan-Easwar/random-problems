#include <iostream>
#include <stdbool.h>
#include <math.h>

using namespace std;

bool isPowerOfTwo(int n) {
    if(n == 0) {
        return false;
    }
    return (ceil(log2(n)) == floor(log2(n)));
}

int powersOfTwo(int arr[], int n) {
    int count = 0;
    for(int i = 0; i < n; i++) {
        for(int j = i + 1; j < n; j++) {
            if(isPowerOfTwo(arr[i] + arr[j])) {
                count++;
            }
        }
    }
    return count;
}

int main() {
    int n;
    cin >> n;
    int arr[n];
    for(int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    cout << powersOfTwo(arr, n) << endl;
    return 0;
}
