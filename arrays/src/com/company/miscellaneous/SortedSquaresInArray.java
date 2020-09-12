package com.company.miscellaneous;

public class SortedSquaresInArray {

    public int[] sortedSquares(int[] A) {

        int i = 0, j = A.length - 1, k = A.length - 1;
        int result [] = new int[A.length];

        while (i <= j){
            if(Math.abs(A[i]) < Math.abs(A[j])){
                result[k--]=A[i]*A[i];
                i++;
            } else {
                result[k--]=A[j]*A[j];
                j--;
            }
        }

        return result;


    }

}
