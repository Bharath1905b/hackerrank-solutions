// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/fundamentals-of-programming/challenges/electricity-bill-14-3/problem?isFullScreen=true
// Problem     Decision Making - Electricity Bill
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-25, 02:06 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: units consumed
        if (sc.hasNextInt()) {
            int units = sc.nextInt();
            double bill = 0;

            // Logic based on the provided slabs
            if (units <= 200) {
                bill = units * 0.50;
            } else if (units <= 400) {
                bill = (units * 0.65) + 100;
            } else if (units <= 600) {
                bill = (units * 0.80) + 200;
            } else {
                bill = (units * 1.25) + 425;
            }

            // Output format: Rs. followed by the integer value
            System.out.println("Rs." + (int) bill);
        }
        
        sc.close();
    }
}
