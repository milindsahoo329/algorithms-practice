package com.company.miscellaneous;

public class DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        int count = 0;
        for(int i=0; i < arr.length; i++){
            if(arr[i] == 0)
                count++;
        }
        int k = arr.length + count - 1;

        int j = arr.length - 1;
        while(j >= 0 || k >= 0){
            if(arr[j] == 0){
                if(k < arr.length )
                    arr[k] = 0;
                k--;
                if(k < arr.length )
                    arr[k] = 0;
            } else {
                if(k < arr.length )
                    arr[k] = arr[j];
            }
            j--;
            k--;
        }
    }

}
