package Fuctional_Recursion;

import java.util.Scanner;

public class Factorial {
    static int fact(int n) {
        if( n < 1){
            return 1;
        }

        return n * fact( n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for finding the fact of it: ");
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            int ans = fact(n);
            System.out.println(ans);
        }

        sc.close();
    }
}
