package Problems;

// source: https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java
public class FindOutlier {
    public static int solve(int[] integers) {
        int oddCount = 0, evenCount = 0, lastOdd = 0, lastEven = 0;

        for (int number : integers) {
            if (number % 2 == 0) {
                evenCount++;
                lastEven = number;
            } else {
                oddCount++;
                lastOdd = number;
            }
        }

        return (oddCount > evenCount) ? lastEven : lastOdd;
    }
}

/* My code is the best :) */
