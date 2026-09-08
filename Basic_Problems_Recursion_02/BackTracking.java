package Basic_Problems_Recursion_02;

import java.util.Scanner;

// n to 1
public class BackTracking {

    static void printLin(int i, int n) {
        if( i > n) return ;
        printLin( i + 1, n);
        System.out.println(i + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
          System.out.println("enter a psotive number: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println("Number from 1 to " + n + " are :" );
            printLin(1, n);
             }
        sc.close();
         }
}
