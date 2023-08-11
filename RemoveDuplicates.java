//Remove Duplicates in-place from Sorted Array
//Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.
//If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.
//Note: Return k after placing the final result in the first k slots of the array.


import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		// HashSet<Integer> hm=new HashSet<>();
		// for(int i=0;i<n;i++){
		// 	hm.add(arr.get(i));
		// }
		// int index=0;
		// for(int it:hm){
		// 	arr.set(index, it);
		// 	index++;
		// }
		// return index;


		int i=0;
		for(int j=1;j<n;j++){
			if(arr[i]!=arr[j]){
				arr[i+1]=arr[j];
				i++;
			}
		}
		return i+1;
	}
}
