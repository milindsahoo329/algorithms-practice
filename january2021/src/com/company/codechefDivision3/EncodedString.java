package com.company.codechefDivision3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EncodedString {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfTestCases = Integer.parseInt(br.readLine());

       // System.out.println(numOfTestCases);

        int N[] = new int[numOfTestCases];
        String S[] = new String[numOfTestCases];

        for(int i=0; i<numOfTestCases; i++){
            N[i] = Integer.parseInt(br.readLine());
           // System.out.println(N[i]);
            S[i] = br.readLine();
           // System.out.println(S[i]);
        }

        findDecodedWord(N,S,numOfTestCases);
    }

    private static void findDecodedWord(int[] N, String[] S, int numOfTestCases) {

        char character = 'a';
        for(int i=0; i<numOfTestCases; i++){

            int j = 0;
            int low = 0, mid = 8, high = 15;
            //System.out.println("length - "+S[i].length());
            while(j<S[i].length()){

                if(j%4 == 3){
                    if(S[i].charAt(j)=='1'){
                        System.out.print((char)(character+high));
                    }else {
                        System.out.print((char)(character+low));
                    }
                    mid = 8;
                    high = 15;
                    low = 0;
                    //System.out.println("low "+low+" high "+high);
                } else {
                    if(S[i].charAt(j)=='1'){
                        low = low + mid;
                    }else {
                        high = high - mid;
                    }
                    mid = mid/2;
                    //System.out.println("low "+low+" high "+high);
                }
                j++;
            }
            System.out.println();
        }

    }

}
