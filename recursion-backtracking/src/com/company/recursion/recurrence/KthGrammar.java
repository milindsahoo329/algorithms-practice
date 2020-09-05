package com.company.recursion.recurrence;

public class KthGrammar {

//    Examples:
//    Input: N = 1, K = 1
//    Output: 0
//
//    Input: N = 2, K = 2
//    Output: 1
//
//    Input: N = 4, K = 5
//    Output: 1
//
//    Explanation:
//    row 1: 0
//    row 2: 01
//    row 3: 0110
//    row 4: 01101001

    public int kthGrammar(int N, int K) {

        if(N==1)
            return 0;

        int digit = kthGrammar(N-1, (K+1)/2);

        if(K % 2 == 0)
            digit = digit == 0 ? 1 : 0;

        return digit;

    }
}
