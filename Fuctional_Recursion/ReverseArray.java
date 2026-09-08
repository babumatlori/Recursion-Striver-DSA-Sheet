package Fuctional_Recursion;

import java.util.Scanner;

public class ReverseArray {

    // Using the 2 pointer apporach
    static void reverser(int [] arr, int r, int l) {
        if(r >= l) {
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverser(arr, r + 1, l - 1);
    }

    // using the 1 pointer approach
    static void rev(int [] arr, int n) {
        if ( n >= arr.length / 2) return;

        int temp = arr[n];
        arr[n] = arr[arr.length - n - 1];
        arr[arr.length - n - 1] = temp;

        rev(arr, n + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the arry size : ");
        if(sc.hasNextInt()) {
            int n = sc.nextInt();
            int [] arr = new int[n];
            System.out.print("enter the array elements : ");
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            // reverser(arr, 0, n - 1);
            rev(arr, 0);
            System.out.println("the reversed array is : ");
            for(int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
