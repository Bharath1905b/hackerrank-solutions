// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/fundamentals-of-programming/challenges/reverse-each-word-of-a-string/problem?isFullScreen=true
// Problem     Strings - Reverse each word of a string
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-24, 02:23 p.m.
// ──────────────────────────────────────────────────

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        String[] w =s.trim().split("\\s+");

        for (int i = w.length - 1; i >= 0; i--) {
            System.out.print(w[i]);
            if (i > 0) System.out.print(" ");
        }
    }
}
