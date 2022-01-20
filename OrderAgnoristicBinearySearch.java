package com.sreekanth;

public class OrderAgnoristicBinearySearch {
    /*
        Order Agnostic binary search is done when we don't know the sortion order of Array.
        To find sortion order we Compare 'start' and 'end' index elements.
            boolean orderFind = num[start]<num[end];
            If "true" = Ascending Order.
            If "false" = Descending Order.
    */

    public static void main(String[] args) {
        int[] arr = {97,83,74,62,55,47,33,29,14,3};
        int target =47;
        int ans = binarySearchProgram(arr,target);
        System.out.println(ans);
    }
    static int binarySearchProgram(int[] num,int target){

        int start = 0;
        int end = num.length-1;
        boolean orderFind = num[start]<num[end];

        while(start <= end){
            int mid = start + (end - start)/2;
            if(orderFind){
                if(target > num[mid])
                    start = mid +1;
                else if(target < num[mid])
                    end = mid -1;
                else
                    return mid;
            }
            else
                if(target>num[mid])
                    end = mid-1;
                else if(target < num[mid])
                    start = mid+1;
                else
                    return mid;
        }
        return -1;
    }
}
