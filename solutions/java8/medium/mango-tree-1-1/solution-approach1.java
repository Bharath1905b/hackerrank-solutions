// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/fundamentals-of-programming/challenges/mango-tree-1-1/problem?isFullScreen=true
// Problem     Decision Making - Mango tree 
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-23, 02:12 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r = in.nextInt(); 
        int c = in.nextInt(); 
        int n = in.nextInt(); 
        int row = (n - 1) / c + 1;
        int col = (n - 1) % c + 1;

        if (row == 1 || col == 1 || col == c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
