package com.sreekanth;

public class BinarySearchCode {
    /*
        In Binary Search Algorithm,the searching happens only in sorted array.
        1)find the middle element.
        2)If target < arr[mid] , then search left side of Array.(#Ascending order Array)
        3)if target > arr[mid] , then search right side of Array.(#Ascending order Array)
        4)if start > end ,then target is not present in Array(# worst case).
        For binary search worst case 'time complexity' is "O(logN)" for 'N' elements.
    */
    public static void main(String[] args) {

        int[] arr = {7,15,22,39,45,67,73,81,96};
        int target = 39;
        int ans = binarySearchCode(arr,target);
        System.out.println(ans);
    }
    static int binarySearchCode(int[] num,int element){

        int start = 0;
        int end = num.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(num[mid] > element)
                end = mid-1;
            else if(num[mid] < element)
                start = mid +1;

            else
                return mid;
        }
        return -1;
    }
}
