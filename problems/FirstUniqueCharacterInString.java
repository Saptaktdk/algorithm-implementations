//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

import java.util.*;

public class FirstUniqueCharacterInString {
    public static int firstUniqueCharcaterInString(String str) {
	char[] chars = str.toCharArray();

	HashMap<Character, Integer> map = new HashMap<>();

	for (char c : chars) {
		map.put(c, map.getOrDefault(c,0)+1);
	}

	for (int i=0; i<str.length(); i++) {
		if (map.get(str.charAt(i)) == 1) {
			return i;
		}
	}
	
	return -1;
    
    }

    public static void main (String args[]) {
        String str = "lleettccooddee";
        int res = firstUniqueCharcaterInString(str);
        System.out.println("Index of first unique character: " + res);
    }
}