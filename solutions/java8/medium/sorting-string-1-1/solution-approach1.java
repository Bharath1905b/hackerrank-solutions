// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/fundamentals-of-programming/challenges/sorting-string-1-1/problem?isFullScreen=true
// Problem     Strings - Sorting
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-24, 10:16 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        char st[]=s.toCharArray();
        Arrays.sort(st);
        for(int i=0;i<st.length;i++){
            System.out.print(st[i]);
        }
    }
}
