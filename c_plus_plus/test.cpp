#include <iostream>


void display(int n, int *arr) {

	std::cout << sizeof(arr) << "\n";
	for(int i = 0; i < n; ++i) {
		std::cout << *(arr + i);
	}
	std::cout << "\n";
	int arr1[] = { 10, 20, 30, 40 }; 
	*arr1 = *arr;
  
    // Printing elements of an array using 
    // foreach loop 
    for (int x : arr1) 
        std::cout << x << std::endl; 

}

int main() {
	int n, *arr;
	std::cin >> n;
	for(int i = 0; i < n; ++i) {
		std::cin >> arr[i];
	}
	std::cout << sizeof(arr) << "\n";
	display(n, arr);
}
