// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/fundamentals-of-programming/challenges/first-non-repeating-character-2-6/problem?isFullScreen=true
// Problem     Strings - First Non-repeating Character 
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-24, 11:37 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int c[]=new int[256];
        for (int i=0;i<s.length();i++){
            c[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++){
            if(c[s.charAt(i)]==1){
                System.out.print(s.charAt(i));
                return;
            }
        }
        System.out.print("All the characters are repetitive");
    }
}
