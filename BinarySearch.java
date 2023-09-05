// Problem Statement
// You are given an integer array 'A' of size 'N', sorted in non-decreasing order. You are also given an integer 'target'.
// Your task is to write a function to search for 'target' in the array 'A'. If it exists, return its index in 0-based indexing. Otherwise, return -1.
// Note: You must write an algorithm whose time complexity is O(logN).
// Example:
// Input: ‘N’ = 7 ‘target’ = 3
// ‘A’ = [1, 3, 7, 9, 11, 12, 45]
// Output: 1
// Explanation: For A = [1, 3, 7, 9, 11, 12, 45],
// The index of element '3' is 1.
// Hence, the answer is '1'.

public class Solution {
    public static int search(int []nums, int target) {
        // Write your code here.
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target>nums[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
