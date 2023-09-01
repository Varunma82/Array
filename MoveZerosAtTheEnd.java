// Move Zeros At the end.

// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

 

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:

// Input: nums = [0]
// Output: [0]



//Brute Force Method--

// public class Solution {
//         public static int[] moveZeros(int n, int []a) {
//         // Write your code here.
//         int temp[]=new int[n];
//         int nz=0;
//         for(int i=0;i<n;i++){
//             if(a[i]!=0){
//                 temp[nz]=a[i];
//                 nz++;
//             }
//         }
//         for(int i=nz;i<n;i++){
//             a[i]=0;
//         }
//         return temp;
//     }
// }


//Optimal Solution--
class Solution {
    public void moveZeroes(int[] nums) {
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }
        for(int i=j+1;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
}
