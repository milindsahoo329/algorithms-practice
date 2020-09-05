package com.company.recursion.memoization;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {

    // DP solution top-down
    Map<Integer,Integer> map = new HashMap<>();
    public int climbStairs(int n){

        if(n<2)
            return 1;
        if(map.containsKey(n))
            return map.get(n);
        map.put(n,climbStairs(n-1)+climbStairs(n-2));
        return map.get(n);
    }

}
