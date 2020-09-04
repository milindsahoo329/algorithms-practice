package com.company.recursion.recurrence;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PascalsTriangle {

    public static List<Integer> recursiveSolution(int rowIndex){

        if(rowIndex == 0){
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            return row;
        }

        if(rowIndex == 1){
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            row.add(1);
            return row;
        }


        List<Integer> oldRow = recursiveSolution(rowIndex - 1);
        List<Integer> newRow = new ArrayList<Integer>();
        newRow.add(1);

        for(int i = 0; i < oldRow.size()-1; i++){
            newRow.add(oldRow.get(i)+oldRow.get(i+1));
        }

        newRow.add(1);

        return newRow;

    }

    public static List<Integer> iterativeSolution(int rowIndex){
        List<Integer> row = new LinkedList<>();

        for(int i=0; i<rowIndex+1; i++){
            row.add(1);
            for(int j=i-1; j>0; j--){
                row.set(j,row.get(j-1)+row.get(j));
            }
        }

        return row;
    }

}
