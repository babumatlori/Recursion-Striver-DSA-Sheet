package Fuctional_Recursion;

import java.util.Scanner;

public class IsPalindrome {
    static boolean isPal(int n, String str) {
        String cap = str.toLowerCase();
        if(n >= cap.length() / 2) return true;

        if(cap.charAt(n) != cap.charAt(cap.length() - n -1)) return false;
        return isPal(n + 1, cap);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String pal = sc.nextLine();

       System.out.println(isPal(0, pal) ? "Is palindrome" : "Not a Palindrome");

       sc.close();

    }
}
