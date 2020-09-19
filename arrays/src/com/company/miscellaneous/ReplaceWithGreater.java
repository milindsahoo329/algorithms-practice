package com.company.miscellaneous;

public class ReplaceWithGreater {

    public int[] replaceElements(int[] arr) {

        if(arr.length > 2){

            int l = arr.length - 2;
            int max = arr[l+1];

            while(l >= 0){
                int temp = arr[l];
                arr[l--] = max;
                if( temp > max )
                    max = temp;
            }

        }

        arr[arr.length - 1] = -1;
        return arr;

    }

}
