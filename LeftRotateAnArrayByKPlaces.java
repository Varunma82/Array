// Rotate array
// Problem Statement
// Given an array 'arr' with 'n' elements, the task is to rotate the array to the left by 'k' steps, where 'k' is non-negative.


// Example:
// 'arr '= [1,2,3,4,5]
// 'k' = 1  rotated array = [2,3,4,5,1]
// 'k' = 2  rotated array = [3,4,5,1,2]
// 'k' = 3  rotated array = [4,5,1,2,3] and so on.

import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
  Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
    }
    int d=sc.nextInt();
		rotate(arr,d,n);

		//printed the rotated array
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
  }
  public static void rotate(int []arr,int d,int n){
		d=d%n;
		if(d==0){
			return;
		}
		Reverse(arr, 0, d-1);
		Reverse(arr, d, n-1);
		Reverse(arr, 0, n-1);
  }
  public static void Reverse(int []arr,int start,int end){
		while(start<=end){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
}
