// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/fundamentals-of-programming/challenges/sum-of-array-elements-17-2/problem?isFullScreen=true
// Problem     Recursion - Sum of Array Elements 
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-25, 10:11 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {
 public static int sum(int n,int a[]){
    if(n==0){
        return 0;
    }else{
        return a[n-1]+sum((n-1),a);
    }
 }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int x=sum(n,a);
        System.out.print(x);
    }
}
