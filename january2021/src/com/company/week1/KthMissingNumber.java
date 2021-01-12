package com.company.week1;

public class KthMissingNumber {

    public static int findKthPositive(int[] arr, int k) {
        int n = 1, i = 0;
        while (i < arr.length) {
            if (n != arr[i])   k--; //Missing number.
            else if (n == arr[i]) i++;
            if (k == 0) return n;
            n++;
        }
        return n+k-1;
    }

    public static void main(String [] args){
        int[] arr = {2,3,4,10};
        int res = findKthPositive(arr,5);
    }

}
