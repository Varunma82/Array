//Find the Largest element in an array
//Problem Statement: Given an array, we have to find the largest element in the array.

//Examples:
//Example 1:
//Input: arr[] = {2,5,1,3,0};
//Output: 5
//Explanation: 5 is the largest element in the array. 

//Example2: 
//Input: arr[] = {8,10,5,7,9};
//Output: 10
//Explanation: 10 is the largest element in the array.


//Solution:

//Brute Force Method:
//-- First we need to sort an array using Arrays.sort()
//-- Then we need to return arr[n-1]

//		Arrays.sort(arr);
//		return arr[n-1];

//Time Complexity:O(nlogn)

//Optimal Solution:
 		int largest=arr[0];
		for(int i=0;i<n;i++){
			if(arr[i]>largest){
				largest=arr[i]
			}		
		}
		return largest;


//Time Complexity:O(n)
