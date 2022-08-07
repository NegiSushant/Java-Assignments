/*

https://leetcode.com/problems/count-items-matching-a-rule/

11)Ques_1773-->>
                You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color,
                and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:
            ruleKey == "type" and ruleValue == typei.
            ruleKey == "color" and ruleValue == colori.
            ruleKey == "name" and ruleValue == namei.
            Return the number of items that match the given rule.



Example 1:
        Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]],
        ruleKey = "color", ruleValue = "silver"
        Output: 1
        Explanation:
                    There is only one item matching the given rule, which is ["computer","silver","lenovo"].

Example 2:
          Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]],
          ruleKey = "type", ruleValue = "phone"
          Output: 2

          Explanation:
                      There are only two items matching the given rule,
                      which are ["phone","blue","pixel"] and ["phone","gold","iphone"].
                      Note that the item ["computer","silver","phone"] does not match.


 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountItemsMatchingRule {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter number of items: ");
            int rows = in.nextInt();
            List<List<String>> list = new ArrayList<>();
            for (int i=0; i < rows; i++){
                System.out.print("Enter elements in row "+(i+1)+": ");
                List<String> temp = new ArrayList<String>();
                for (int j=0; j < 3; j++) {
                    temp.add(in.next());
                }
                list.add(temp);
            }
            System.out.print("Enter rule key: ");
            String ruleKey = in.next();
            System.out.print("Enter rule value: ");
            String ruleValue = in.next();
            System.out.println("Number of items matching given rule: "+ countMatches(list, ruleKey, ruleValue));
        }
        public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            int check;
            if (ruleKey.equals("type")){
                check = 0;
            }
            else if(ruleKey.equals("color")){
                check = 1;
            }
            else{
                check = 2;
            }
            int count = 0;
            for(int i=0;i<items.size();i++)
                if(items.get(i).get(check).equals(ruleValue))
                    count++;
            return count;
        }
}