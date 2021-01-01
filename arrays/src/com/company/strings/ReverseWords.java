package com.company.strings;

public class ReverseWords {

    public static String reverseWords(String s) {

        int space = 0;
        int x = 0;

        char [] strArray = s.toCharArray();

        for(int i = 0; i < s.length(); i++){
            if(strArray[i] == ' '){
                space = i;
                reverse(strArray, x, space-1);
                x = space + 1;
            }
        }

        reverse(strArray, x, strArray.length - 1);
        return new String(strArray);

    }

    public static void reverse (char [] s, int start, int end) {

        int i = start, j = end;
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        // write your code here

        String s = "Hi I am not a Laker's fan";
        String x = reverseWords(s);
        System.out.println(x);

    }

}
