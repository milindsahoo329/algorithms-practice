package com.company.miscellaneous;

import java.util.Arrays;

public class HeightChecker {

    public int heightChecker(int[] heights) {

        int [] sorted = Arrays.copyOf(heights,heights.length);
        int count = 0;

        Arrays.sort(sorted);

        for(int i = 0; i < heights.length; i++){
            if(heights[i] != sorted[i])
                count++;
        }

        return count;

    }

}
