// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/fundamentals-of-programming/challenges/compute-an-1/problem?isFullScreen=true
// Problem     Recursion - Compute a^n 
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-25, 09:45 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {
 public static int exp(int a,int n){
    if(n==0){
        return 1;
    }
    if(n==1){
        return a;
    }
    else{
        return a*exp(a,n-1);
    }
 }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int n=in.nextInt();
        int x=exp(a,n);
        System.out.print("The value of "+a+" power "+n+" is "+x);
        
    }
}
