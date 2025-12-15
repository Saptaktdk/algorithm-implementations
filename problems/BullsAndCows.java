//Bulls and Cows
//You are playing the Bulls and Cows game with your friend.
//You write down a secret number and ask your friend to guess what the number is. When your friend makes a guess, you provide a hint with the following info:
//The number of "bulls", which are digits in the guess that are in the correct position.
//The number of "cows", which are digits in the guess that are in your secret number but are located in the wrong position. Specifically, the non-bull digits in the guess that could be rearranged such that they become bulls.
//Given the secret number secret and your friend's guess guess, return the hint for your friend's guess.
//The hint should be formatted as "xAyB", where x is the number of bulls and y is the number of cows. Note that both secret and guess may contain duplicate digits.
//Constraints:
//1 <= secret.length, guess.length <= 1000
//secret.length == guess.length
//secret and guess consist of digits only.
//Example:
//Input: secret = "1123", guess = "0111"
//Output: "1A1B"
//Explanation: Bulls are connected with a '|' and cows are underlined:
//"1123"        "1123"
//  |      or     |
//"0111"        "0111"
//Note that only one of the two unmatched 1s is counted as a cow since the non-bull digits can only be rearranged to allow one 1 to be a bull.

import java.util.*;

public class BullsAndCows {
        public static String bullsAndCows (String guess, String secret) {
        char[] g = guess.toCharArray();
        char[] s = secret.toCharArray();

        int bulls = 0;
        int cows = 0;

        for (int i=0; i<g.length; i++) {
            if (g[i] == s[i]) {
                bulls++;
                g[i] = 'b';
                s[i] = 'b';
            }
        } 

        HashMap<Character, Integer> map = new HashMap<>();

        // count the frequencies of the remaining digits
        for (char c: s) {
            if (c != 'b') {
                map.put(c, map.getOrDefault(c,0)+1);
            }
            
        }

        for (char c: g) {

            if (c != 'b' && map.containsKey(c) && map.get(c) > 0) {
                cows++;
                map.put(c, map.get(c)-1);	
            
            }
        
        }

        return bulls + "A" + cows + "B";        
        
    }

    public static void main (String args[]) {
        String secret = "1123";
        String guess = "0111";  

        String res = bullsAndCows(guess, secret);
        System.out.println("Bulls and Cows: " + res);
    }

}