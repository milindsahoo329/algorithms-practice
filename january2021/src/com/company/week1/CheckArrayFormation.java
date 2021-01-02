package com.company.week1;

import java.util.Arrays;

public class CheckArrayFormation {

    public static int[] arr = {86,87};

    public static int[][] pieces = {{86}, {87}};

    public static boolean canFormArray(int[] arr, int[][] pieces) {

//        System.out.println("Arr : "+Arrays.toString(arr));
//        System.out.println("Pieces : "+Arrays.deepToString(pieces));

        int indexArr = 0;
        while(indexArr < arr.length){

            int indexPieces = 0, newIndexArr = indexArr+1;
            while(indexPieces < pieces.length && indexArr < arr.length){
                if(pieces[indexPieces][0] == arr[indexArr]){
                    int indexInternal = 1;
                    while(indexInternal < pieces[indexPieces].length && newIndexArr < arr.length){
                        if(pieces[indexPieces][indexInternal] == arr[newIndexArr]){
                            indexInternal++;
                            newIndexArr++;
                        } else {
                            break;
                        }
                    }
                    if(indexInternal == pieces[indexPieces].length){
                        indexArr = newIndexArr;
                        break;
                    }
                }
                indexPieces++;
            }

            if(newIndexArr == indexArr && indexArr == arr.length) {
                break;
            } else if(indexPieces == pieces.length && indexArr != arr.length){
                return false;
            }

        }

        if(indexArr == arr.length )
            return true;
        else
            return false;

    }

    public static void main(String[] args){
        Boolean b = canFormArray(arr,pieces);
        System.out.println("---"+b);
    }

}
