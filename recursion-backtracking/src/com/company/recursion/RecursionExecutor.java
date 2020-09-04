package com.company.recursion;

import com.company.recursion.basics.ReverseString;
import com.company.recursion.recurrence.PascalsTriangle;

import java.util.List;

public class RecursionExecutor {

    public static void main(String[] args) {

        ReverseString.printReverse("random",0);

        List<Integer> result1 = PascalsTriangle.recursiveSolution(3);
        System.out.println(result1.toString());

        List<Integer> result2 = PascalsTriangle.iterativeSolution(3);
        System.out.println(result2.toString());

    }

}
