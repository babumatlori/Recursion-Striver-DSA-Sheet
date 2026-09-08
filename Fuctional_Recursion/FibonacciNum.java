package Fuctional_Recursion;

import java.util.Scanner;

public class FibonacciNum {
    static int fibNum(int n) {
        if( n <= 1) return n;
        int last = fibNum(n - 1);
        int slast = fibNum(n - 2);

        return last + slast;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            int ans = fibNum(n);
            System.out.println(ans);
        }
        sc.close();
    }
}
