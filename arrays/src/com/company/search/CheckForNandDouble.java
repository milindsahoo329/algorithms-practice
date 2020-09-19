package com.company.search;

import java.util.HashMap;
import java.util.HashSet;

public class CheckForNandDouble {

    public boolean checkIfExist(int[] arr) {

        HashSet<Integer> set  = new HashSet<Integer>();

        for(int n : arr){
            if(( set.contains(n/2) && n%2==0) || set.contains(2*n)){
                return true;
            }
            if(!set.contains(n)){
                set.add(n);
            }
        }

        return false;

    }

}
