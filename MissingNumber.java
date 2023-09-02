// Missing Number
// Problem Statement
// Given an array ‘a’ of size ‘n’-1 with elements of range 1 to ‘n’. The array does not contain any duplicates. Your task is to find the missing number.
// For Example:
// Input:
// 'a' = [1, 2, 4, 5], 'n' = 5
// Output :
// 3
// Explanation: 3 is the missing value in the range 1 to 5.


public class Solution {
    public static int missingNumber(int []a, int N) {
        // Write your code here.
        int sum=(N*(N+1))/2;
        int s2=0;
        for(int i=0;i<N;i++){
            s2+=a[i];
        }
        return (sum-s2);
    }
}
