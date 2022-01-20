package com.sreekanth;

public class LinearSearchCode {
    /*
        In linear search algorithm,the searching happens from
            zeroth index to last index in array
        Its best case is 1 comparison O(1)
        Its worst case  is 'N' comparisons i.e, O(N)
    */
    public static void main(String[] args) {
        int[] arr = {75,32,46,82,37,24,17,18,93,51};
        int target = 37;
        int ans = linearSearchCode(arr,target);
        System.out.println(ans);
    }
    static int linearSearchCode(int[] num,int element){

        for(int i = 0; i< num.length;i++){
            if(element == num[i])
                return i;
        }
        return -1;
    }
}
