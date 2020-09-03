package com.company.recursion.basics;

public class ReverseString {


    public static void reverseString(String str){
        char[] charArray = str.toCharArray();
        reverseHelper(charArray,0,str.length() - 1);
    }

    // Reverse a character array

    public static void reverseHelper(char [] charArray, int left, int right){

        if(left >= right)
            return;

        char temp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = temp;

        left++;
        right--;
        reverseHelper(charArray,left,right);
    }

    // Print reverse of a string

    public static void printReverse(String str, int index){

        if( index >= str.length() || str == null ){
            return;
        }

        printReverse(str,index+1);
        System.out.print(str.charAt(index));

    }

}
