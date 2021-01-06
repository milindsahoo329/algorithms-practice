package com.company.week1;

public class BeautifulArrangement {

    static int count = 0;

    public static int countArrangement(int n) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = i + 1;
        permute(nums, 0);
        return count;
    }

    private static void permute(int[] nums, int k) {
            if (k == nums.length && isValid(nums))
                count++;
            for (int i = k; i < nums.length; i++) {
                swap(nums, i, k);
                permute(nums, k + 1);
                swap(nums, i, k);
            }
    }

    private static boolean isValid(int[] nums) {
        for (int k = 1; k <= nums.length; k++)
            if (nums[k - 1] % k != 0 && k % nums[k - 1] != 0)
                return false;
        return true;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String [] args){
        System.out.println(countArrangement(3));
    }

}
