package Problems;

// source: https://www.codewars.com/kata/5503013e34137eeeaa001648/train/java
public class Diamond {
    public static String solve(int n) {
        if (n % 2 == 0 || n < 0) return null;

        StringBuilder stringBuilder = new StringBuilder();

        int middleCol = (n / 2);
        int increase = 0;
        boolean swapIncrease = false;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < (n - middleCol) + increase; col++) {
                if (col >= (middleCol - increase)) {
                    stringBuilder.append("*");
                } else {
                    stringBuilder.append(" ");
                }
            }

            if (row == middleCol) swapIncrease = true;
            if (swapIncrease) {
                increase--;
            } else {
                increase++;
            }

            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}

/*
    :: Best solution

    public static String print(int n) {
        if (n % 2  == 0 || n <= 0) {return null;}
        StringBuffer expected = new StringBuffer();

        for (int i = 1; i <= n; i+=2) {
            expected.append(" ".repeat((n - i) / 2) + "*".repeat(i) + "\n");
        }
        for (int i = n - 2; i >= 1; i-=2) {
            expected.append(" ".repeat((n - i) / 2) + "*".repeat(i) + "\n");
        }
        return expected.toString();
  }
*/