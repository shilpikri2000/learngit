#include<iostream>
using namespace std;
#include <stdio.h> 


int binarySearch(int arr[], int l, int r, int x) 
{ 
if (r >= l) 
{ 
		int mid = l + (r - l)/2; 

		
		if (arr[mid] == x) return mid; 

		
		if (arr[mid] > x) return binarySearch(arr, l, mid-1, x); 

		
		return binarySearch(arr, mid+1, r, x); 
} 

 
return -1; 
} 

int main(void) 
{ 
int arr[] =  new int[size]
cout<<"enter the size of array";
cin>>arr[sizeof];
for(int i=1;i<=arr.length-1;i++){
    
}
int n = sizeof(arr)/ sizeof(arr[0]); 
int x = 40; 
int result = binarySearch(arr, 0, n-1, x); 
(result == -1)? printf("Element is not present in array") 
				: printf("Element is present at index %d", result); 
return 0; 
} 
