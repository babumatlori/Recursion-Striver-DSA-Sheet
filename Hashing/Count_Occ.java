package Hashing;

import java.util.Scanner;

public class Count_Occ {
    static void countFeq(int [] arr) {
        int n = arr.length;

        int [] hash = new int[n + 1];

        for(int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        for(int i = 1; i <= n; i++) {
            if(hash[i] > 0) {
                System.out.println(i + " -> " + hash[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the function
        countFeq(arr);

        sc.close();
    }
}
