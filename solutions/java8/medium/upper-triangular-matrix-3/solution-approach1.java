// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/fundamentals-of-programming/challenges/upper-triangular-matrix-3/problem?isFullScreen=true
// Problem     Arrays 2D - Upper triangular matrix 
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-23, 03:25 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static int upt (int a[][],int n){
        for (int i=1;i<n;i++){
            for (int j=0;j<i;j++){
                if(a[i][j]!=0){
                    return 0;
                }
            }
        }
      return 1;  
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[][]=new int[n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=in.nextInt();
            }
        }
        int x=upt(a,n);
        if (x==1){
            System.out.print("Upper triangular matrix");
        }else{
            System.out.print("Not an Upper triangular matrix");
            }
    }
}
