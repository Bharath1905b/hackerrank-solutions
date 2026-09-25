// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/fundamentals-of-programming/challenges/checking-alphabets-1/problem?isFullScreen=true
// Problem     Decision Making - Checking Alphabets 
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-25, 12:14 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Check if there is input available
        if (sc.hasNext()) {
            char ch = sc.next().charAt(0);
            
            // Check if the character is an alphabet
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                
                // Convert to lowercase to make checking vowels easier
                char lowerCh = Character.toLowerCase(ch);
                
                if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
                
            } else {
                // If it is not between a-z or A-Z
                System.out.println("Not an alphabet");
            }
        }
        
        sc.close();
    }
}
