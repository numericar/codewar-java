package Problems;

import java.util.HashMap;

// source: https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java
public class DuplicateEncoder {
    public static String solve(String word) {
        word = word.toLowerCase();
        HashMap<Character, Boolean> duplicateGroup = new HashMap<Character, Boolean>();

        for (int index = 0; index < word.length(); index++) {
            char character = word.charAt(index);

            if (duplicateGroup.containsKey(character)) {
                duplicateGroup.replace(character, true);
            } else {
                duplicateGroup.put(character, false);
            }
        }

        String result = "";
        for (int index = 0; index < word.length(); index++) {
            Boolean isDuplicate = duplicateGroup.get(word.charAt(index));

            if (isDuplicate) {
                result += ")";
            } else {
                result += "(";
            }
        }

        return result;
    }
}

/*
 	:: Best solution

 	public class DuplicateEncoder {
		static String encode(String word){
    	word = word.toLowerCase();
    	String result = "";
    	for (int i = 0; i < word.length(); ++i) {
      		char c = word.charAt(i);
      		result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
    	}
    	return result;
  	}
 */
