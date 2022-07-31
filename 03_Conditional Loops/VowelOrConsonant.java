//Ques_21->>>>Java Program Vowel Or Consonant.

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Alphabet: ");
        char alpha = sc.next().charAt(0);

        if(alpha=='a'||alpha=='A'||alpha=='e'||alpha=='E'||alpha=='o'||alpha == 'O'||alpha == 'u'||
                alpha == 'U'||alpha == 'i'||alpha =='I'){
            System.out.println(alpha+" is a Vowel.");
        }
        else{
            System.out.println(alpha+" is a Consonant.");
        }


    }
}