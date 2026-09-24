// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/fundamentals-of-programming/challenges/string-palindrome-21/problem?isFullScreen=true
// Problem     Strings -  Palindrome 
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-24, 09:41 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String z=" ";
        StringBuilder a=new StringBuilder(s);
        a=a.reverse();
        z=a.toString();
        if(s.equals(z)){
            System.out.println("Palindrome");
        }
        else{
            System.out.print("Not a Palindrome");
        }
    }
}
