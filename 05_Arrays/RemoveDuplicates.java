/*
27)Ques_26--->>>
            Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each
             unique element appears only once. The relative order of the elements should be kept the same.

            Since it is impossible to change the length of the array in some languages, you must instead have
            the result be placed in the first part of the array nums. More formally, if there are k elements
            after removing the duplicates, then the first k elements of nums should hold the final result. It does not
            matter what you leave beyond the first k elements.

            Return k after placing the final result in the first k slots of nums.

            Do not allocate extra space for another array. You must do this by modifying the input array
            in-place with O(1) extra memory.

Custom Judge:--->>>>

                    The judge will test your solution with the following code:

                            int[] nums = [...]; // Input array
                            int[] expectedNums = [...]; // The expected answer with correct length

                            int k = removeDuplicates(nums); // Calls your implementation

                            assert k == expectedNums.length;
                            for (int i = 0; i < k; i++) {
                                assert nums[i] == expectedNums[i];
                            }
                    If all assertions pass, then your solution will be accepted.



Example 1:--->>>>
            Input: nums = [1,1,2]
            Output: 2, nums = [1,2,_]
            Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
            It does not matter what you leave beyond the returned k (hence they are underscores).

Example 2:--->>
                Input: nums = [0,0,1,1,1,2,2,3,3,4]
                Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
                Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
                It does not matter what you leave beyond the returned k (hence they are underscores).

 */

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of Array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the number in Array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Array enter is: "+ Arrays.toString(nums));
        System.out.println("Number remaining after removing Duplicates is: "+removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int i = 0;

        for (int j = 1; j < n; j++) {
            if (nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}