package Problems;

// source: https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java
public class Order {
    public static String solve(String words) {
        String[] wordGroup = words.split(" ");

        int n = wordGroup.length;
        for (int round = 0; round < n - 1; round++) {
            for (int currentIndex = 0; currentIndex < n - 1; currentIndex++) {
                int nextIndex = currentIndex + 1;
                int currentNumber = getNumberInWord(wordGroup[currentIndex]);
                int nextNumber = getNumberInWord(wordGroup[nextIndex]);

                if (currentNumber > nextNumber) {
                    String temp = wordGroup[currentIndex];
                    wordGroup[currentIndex] = wordGroup[nextIndex];
                    wordGroup[nextIndex] = temp;
                }
            }
        }

        return String.join(" ", wordGroup);
    }

    private static int getNumberInWord(String word) {
        int number = -1;
        for (int i = 0; i < word.length(); i++) {
            boolean isNumber = (word.charAt(i) >= '0' && word.charAt(i) <= '9');

            if (isNumber) {
                number = word.charAt(i) - '0';
                break;
            }
        }

        return number;
    }
}

/*
    :: Best solution

    public static String order(String words) {
        return Arrays.stream(words.split(" "))
        .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
        .reduce((a, b) -> a + " " + b).get();
    }
*/
