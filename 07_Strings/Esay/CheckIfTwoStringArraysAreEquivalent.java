/*
06)Ques_1662----->>>>>>
                Given two string arrays word1 and word2,
                return true if the two arrays represent the same string, and false otherwise.

                A string is represented by an array if the array elements concatenated in order forms the string.


Example 1:--->>>>>
                Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
                Output: true
                Explanation:--->>>>>
                                word1 represents string "ab" + "c" -> "abc"
                                word2 represents string "a" + "bc" -> "abc"
                                The strings are the same, so return true.


Example 2:----->>>>
                Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
                Output: false
                Example 3:

                Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
                Output: true

 */
public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args){
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};

        System.out.println(arrayStringsAreEqual(word1, word2));


    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2){
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            s1.append(word1[i]);
        }

        for (int j = 0; j < word2.length; j++) {
            s2.append(word2[j]);
        }

        return s1.toString().equals(s2.toString());
    }
}
