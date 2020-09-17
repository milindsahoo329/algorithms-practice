package com.company.miscellaneous;

public class DeleteDuplicatesSorted {

    public static int removeDuplicates(int[] nums) {
        if(nums.length > 0){
            int k = 1, i = 1;
            while(i < nums.length){
                if(nums[i-1] != nums[i]){
                    nums[k++]=nums[i];
                }
                i++;
            }
            return k;
        }
        return 0;
    }

}
