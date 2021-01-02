package com.company.codechefDivision3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ChefAndDivision3 {

    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfTestCases = Integer.parseInt(br.readLine());

        int N[] = new int[numOfTestCases], D[] = new int[numOfTestCases], K[] = new int[numOfTestCases];
        int A[][] =  new int[numOfTestCases][];


        for(int i=0; i<numOfTestCases; i++){

            String[] integersInString = br.readLine().split(" ");
            //System.out.println(Arrays.toString(integersInString));
            N[i] = Integer.parseInt(integersInString[0]);
            K[i] = Integer.parseInt(integersInString[1]);
            D[i] = Integer.parseInt(integersInString[2]);

            String[] numOfProblemsInString = br.readLine().split(" ");
            //System.out.println(Arrays.toString(numOfProblemsInString));
            int a[] = new int[numOfProblemsInString.length];
            for (int k = 0; k < numOfProblemsInString.length; k++) {
                a[k] = Integer.parseInt(numOfProblemsInString[k]);
            }

            A[i]=a;

        }

        checkChefAndDivision3(N,D,K,A, numOfTestCases);

//        System.out.println("N"+ Arrays.toString(N));
//        System.out.println("D"+ Arrays.toString(D));
//        System.out.println("K"+ Arrays.toString(K));
//        System.out.println("A"+ Arrays.deepToString(A));

    }

    private static void checkChefAndDivision3(int[] N, int[] D, int[] K, int[][] A, int numOfTestCases) {

        for(int i=0; i<numOfTestCases; i++){

            int sum=0;
            for(int j=0; j<A[i].length; j++){
                sum = sum + A[i][j];
            }

            int noOfEvents = sum/K[i];

            if(noOfEvents>D[i])
                noOfEvents = D[i];

            System.out.println(noOfEvents);

        }

    }


}
