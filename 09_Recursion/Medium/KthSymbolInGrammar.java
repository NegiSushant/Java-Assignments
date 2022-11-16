import java.util.Scanner;

/*

https://leetcode.com/problems/k-th-symbol-in-grammar/

Ques_779--------->>>>>>>>
                    We build a table of n rows (1-indexed). We start by writing 0 in the 1st row.
                    Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01,
                    and each occurrence of 1 with 10.

                    For example, for n = 3, the 1st row is 0, the 2nd row is 01, and the 3rd row is 0110.
                    Given two integer n and k, return the kth (1-indexed) symbol in the nth row of a table of n rows.


Example 1:----->>>>>>
                Input: n = 1, k = 1
                Output: 0
                Explanation: row 1: 0

Example 2:------>>>>>
                Input: n = 2, k = 1
                Output: 0
                Explanation:----->>>>>
                            row 1: 0
                            row 2: 01

Example 3:----->>>>>
                Input: n = 2, k = 2
                Output: 1
                Explanation:----->>>>>>>
                                row 1: 0
                                row 2: 01
 */
public class KthSymbolInGrammar {
    public static void main(String[] args){
        int n = 2;
        int k = 2;

        System.out.println(kthGrammar(n, k));

    }
    public static int kthGrammar(int n, int k) {
        return recurse(n, k - 1);
    }

    public static int recurse(int N, int K){
        if(N == 1) return 0;
        int v = recurse(N-1, K/2);

        return K % 2 == 0 ? v : 1 - v;
    }

}
