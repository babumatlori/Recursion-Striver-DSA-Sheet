package Parameterised_Recursion;

import java.util.Scanner;
// Using the Parameterised recursion
// dryRun
// sum(5, 0)
//       ↓
// sum(4, 5)
//       ↓
// sum(3, 9)
//       ↓
// sum(2, 12)
//       ↓
// sum(1, 14)
//       ↓
// sum(0, 15)
public class SumOfNum {
    static void sum(int i, int n) {
        if( i < 1) {
            System.out.println(n);
            return;
        }

        sum(i - 1, n + i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            sum(n, 0);
        }
        sc.close();
    }
}
