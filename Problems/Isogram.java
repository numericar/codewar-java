package Problems;

// source: https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java
public class Isogram {
    public static boolean solve(String str) {
        str = str.toLowerCase();

        for (int current = 0; current < str.length(); current++) {
            char currentCharacter = str.charAt(current);

            for (int next = (current + 1); next < str.length(); next++) {
                char nextCharacter = str.charAt(next);

                if (currentCharacter == nextCharacter) {
                    return false;
                }
            }
        }

        return true;
    }
}

/*
	:: Best solution

	public static boolean  isIsogram(String str) {
    	return str.length() == str.toLowerCase().chars().distinct().count();
  	}
*/
