
#include<iostream> 
#include<cmath> 

using namespace std; 

 
int prevComplement(int n, int b) 
{ 
	int maxDigit, maxNum = 0, digits = 0, num = n; 
	
	while(n!=0) 
	{ 
		digits++; 
		n = n/10; 
	} 
	
	
	maxDigit = b-1; 
	
	
	while(digits--) 
	{ 
		maxNum = maxNum*10 + maxDigit; 
	} 
	
	
	return maxNum - num; 
} 


int complement(int n, int b) 
{ 
	
	return prevComplement(n,b) + 1; 
} 


int main() 
{ 
    int n;
    cin>>n;
    int r;
    cin>>r;
	cout << prevComplement(n,r)<<end;
	
	cout << complement(n,r);
	
	return 0; 
} 
