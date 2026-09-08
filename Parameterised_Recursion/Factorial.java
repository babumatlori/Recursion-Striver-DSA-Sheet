package Parameterised_Recursion;

import java.util.Scanner;

public class Factorial {
    static void fact(int i, int n) {
        if( i < 1) {
            System.out.println(n);
            return;
        }

        fact(i - 1, i * n);
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            fact(n, 1);
        }
        sc.close();
    }
}
