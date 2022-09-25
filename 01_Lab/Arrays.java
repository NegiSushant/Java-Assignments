import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("please enter the length of array: ");
        int n = sc.nextInt();

        int i, j = n-1;

        int[] array = new int[n];
        for (i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for (i=0; j>=0; i++)
        {
            if(i < n)
            {
                System.out.println(array[i]);
                continue;
            }

            if(i == n)
            {
                System.out.println("\n");
            }
            System.out.println(array[j]);
            j--;
        }
    }
}
