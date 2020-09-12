package com.company.miscellaneous;

public class ConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

        int max = 0, count = 0;

        for(int i = nums.length - 1 ; i >= 0; i--){

            if(nums[i] == 1){
                count++;
            }

            if(nums[i] == 0){
                count=0;
            }

            if(count > max)
                max = count;

        }

        return max;

    }

}
