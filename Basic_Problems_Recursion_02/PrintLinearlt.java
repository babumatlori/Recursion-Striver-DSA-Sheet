package Basic_Problems_Recursion_02;

import java.util.Scanner;

//print lineraly from 1 to N

public class PrintLinearlt {
    static void printlIn(int i, int n) {
        if( i > n) return;
        System.out.println(i);
        printlIn(i+1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("enter a psotive number: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println("Number from 1 to " + n + " are :" );
            printlIn(1, n);
        }
        sc.close();
    }
}
