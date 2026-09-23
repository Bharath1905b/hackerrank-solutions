// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/fundamentals-of-programming/challenges/the-newspaper-agency-5/problem?isFullScreen=true
// Problem     Operators - The Newspaper Agency
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-23, 02:10 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in=new Scanner (System.in);
       int c=in.nextInt();
       int sp=in.nextInt();
       int cp=in.nextInt();
       int spp=c*sp;
       int cpp=c*cp;
       System.out.print((spp-cpp)-100);
       
    
}
}
