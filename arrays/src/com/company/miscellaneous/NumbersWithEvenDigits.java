package com.company.miscellaneous;

public class NumbersWithEvenDigits {

    public int findNumbers(int[] nums) {

        int count = 0;

        for(int n : nums){
            int num = n, digit = 0;
            while(num != 0){
                num = num / 10;
                digit++;
            }
            if(digit % 2 == 0)
                count++;
        }

        return count;

    }

    public int findNumbersAlternate(int[] nums) {
        int count=0;
        for(int x : nums){
            //if ((int)(Math.log10(x)+1) % 2 ==0) count++;

            if((x>=10&&x<=99)||(x>=1000&&x<=9999)||(x>=100000&&x<=999999)) count++;
        }

        return count;

    }

}
