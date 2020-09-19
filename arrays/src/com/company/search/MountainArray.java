package com.company.search;

public class MountainArray {

    public boolean validMountainArray(int[] A) {
        int inc = 0, dec = 0, i = 0;
        while(i < A.length - 1){
            if(A[i] < A[i+1])
                inc++;
            else
                break;

            i++;
        }

        while(i < A.length - 1){
            if(A[i]>A[i+1])
                dec++;
            else
                break;

            i++;
        }

        if( inc > 0 && dec > 0 && (inc + dec) == A.length-1)
            return true;

        return false;
    }

}
