package Basic_Problems_Recursion_02;

import java.util.Scanner;

//print lineraly from n to 1
public class PrintLineary {
    static void printLin(int i, int n) {
        if( i < 1) return;
        System.out.println(i);
        printLin(i -1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("enter a psotive number: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println("Number from 1 to " + n + " are :" );
            printLin(n, 1);
        }
        sc.close();
    }
}
