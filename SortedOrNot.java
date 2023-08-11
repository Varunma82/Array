// Check if an Array is Sorted
// Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.
// Note: Two consecutive equal values are considered to be sorted.
// Example 1:
// Input: N = 5, array[] = {1,2,3,4,5}
// Output: 1
// Explanation: The given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True.


import java.util.*;
class Solution {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        for(int i=1;i<n;i++){
            if(a[i]>=a[i-1]){
            
          }else{
              return 0;
          }
        }
        return 1;
    }
}
