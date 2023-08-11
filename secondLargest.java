//Find Second Smallest and Second Largest Element in an array

//Problem Statement:  Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

//Solution:  
public class Solution {
    static int getSecondLargest(int n,int []a){
        int largest=a[0];
        int secondLargest=-1;
        for(int i=1;i<n;i++){
            if(a[i]>largest){
                secondLargest=largest;
                largest=a[i];
            }else if(a[i]>secondLargest&&a[i]!=largest){
                secondLargest=a[i];
            }
        }
        return secondLargest;
    }
    static int getSecondSmallest(int n,int []a){
        int smallest=a[0];
        int secondSmallest=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(a[i]<smallest){
                secondSmallest=smallest;
                smallest=a[i];
            }else if(a[i]<secondSmallest&&a[i]!=smallest){
                secondSmallest=a[i];
            }
        }
        return secondSmallest;
        
    }
    
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int sLargest=getSecondLargest(n, a);
        int sSmallest=getSecondSmallest(n,a);
        int[] result={sLargest,sSmallest};
        return result;
    }
}
