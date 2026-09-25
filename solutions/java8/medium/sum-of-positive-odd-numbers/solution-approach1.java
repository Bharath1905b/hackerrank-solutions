// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/fundamentals-of-programming/challenges/sum-of-positive-odd-numbers/problem?isFullScreen=true
// Problem     Recursion - Sum of Positive Odd Numbers
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-25, 10:57 a.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class SumOfPositiveOddNumbers {

    // Recursive method to calculate the sum of positive odd numbers
    public static int sumOfOdd(int[] arr, int n) {
        // Base case: if the array is empty
        if (n <= 0) {
            return 0;
        }
        
        // Check if the last element is a positive odd number
        int lastElement = arr[n - 1];
        int currentSum = (lastElement > 0 && lastElement % 2 != 0) ? lastElement : 0;

        // Recursive call for the rest of the array
        return currentSum + sumOfOdd(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Input the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate the sum of positive odd numbers
        int sum = sumOfOdd(arr, n);

        // Output the result
        System.out.println("Sum = " + sum);
        
        scanner.close();
    }
}
