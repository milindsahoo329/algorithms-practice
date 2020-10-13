package com.company.miscellaneous;

public class FindRightK {

    // int [] air = {0,-2,1,3,-5}; //4

    // { -5, 1, -3, 10 } // 8

    // { -5, -10, 10 } // 16

    // {

    public static int findK(int [] arr){

        int i = 1;

        int k = arr[0] >= 1 ? 0 : ( -1 * arr[0] + 1 );
        int sum = k + arr[0];

        while ( i < arr.length ){

            if( ! ((sum + arr[i]) >= 1) ){
                k = k + ( -1 * ((sum + arr[i])) ) + 1;
                sum = 1;
            } else {
                sum = sum + arr[i];
            }
            i++;
        }

        System.out.println(" K = "+k);

        return k;

    }


    public static void main(String[] args) {
        // write your code here

        int [] arr = {  -2, -1 };

        findK(arr);

    }

}
