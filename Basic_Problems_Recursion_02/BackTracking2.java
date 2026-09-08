package Basic_Problems_Recursion_02;

import java.util.Scanner;

public class BackTracking2 {
    static void println(int i, int n ) {
        if (i < 1) return;
        println(i-1, n);
        System.out.println(i + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a psotive number: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println("Number from 1 to " + n + " are :" );
            println(n, 1);
        }
        sc.close();

    }
}
