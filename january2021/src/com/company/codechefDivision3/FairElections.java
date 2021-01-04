package com.company.codechefDivision3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class FairElections {

    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfTestCases = Integer.parseInt(br.readLine());

        int A[][] =  new int[numOfTestCases][];
        int B[][] =  new int[numOfTestCases][];
        int sumOfA[] = new int[numOfTestCases], sumOfB[] = new int[numOfTestCases];


        for(int i=0; i<numOfTestCases; i++){

            String[] integersInString = br.readLine().split(" ");

            int a = Integer.parseInt(integersInString[0]);
            int b = Integer.parseInt(integersInString[1]);

            String[] numOfVotesA = br.readLine().split(" ");
            int sumA=0;
            int sampleA[] = new int[a];
            for (int k = 0; k < a; k++) {
                sampleA[k] = Integer.parseInt(numOfVotesA[k]);
                sumA=sumA+sampleA[k];
            }
            Arrays.sort(sampleA);
            A[i]=sampleA;
            sumOfA[i]=sumA;

            String[] numOfVotesB = br.readLine().split(" ");
            int sumB=0;
            int sampleB[] = new int[b];
            for (int k = 0; k < b; k++) {
                sampleB[k] = Integer.parseInt(numOfVotesB[k]);
                sumB=sumB+sampleB[k];
            }
            Arrays.sort(sampleB);
            B[i]=sampleB;
            sumOfB[i]=sumB;

        }

        findFairElections(A,B,sumOfA,sumOfB,numOfTestCases);


    }

    private static void findFairElections(int[][] A, int[][] B, int[] sumOfA, int[] sumOfB, int numOfTestCases) {

        for(int i=0; i<numOfTestCases; i++){

            int swaps = 0;
            int left = 0, right = B[i].length - 1;
            int sumA=sumOfA[i], sumB=sumOfB[i];

            if(sumA>sumB){
                System.out.println(0);
            } else {
                while(left < A[i].length && right >= 0){
                        sumA=sumA-A[i][left]+B[i][right];
                        sumB=sumB+A[i][left]-B[i][right];
                        swaps++;
                        if(sumA>sumB){
                            break;
                        }
                        left++;
                        right--;
                }

                if(left == A[i].length || right == 0){
                    System.out.println(-1);
                } else {
                    System.out.println(swaps);
                }
            }





        }

    }

}
