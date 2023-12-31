package Problems;

// source: https://www.codewars.com/kata/5552101f47fc5178b1000050/train/java
public class DigPow {
    public static long solve(int n, int p) {
        String numberText = Integer.toString(n);

        long result = 0L;
        int pow = p;
        for (int index = 0; index < numberText.length(); index++) {
            int number = (numberText.charAt(index) - '0');

            result += (long) Math.pow(number, pow);
            pow++;
        }

        double sumOfNP = Math.pow(n, p);
        if (result == sumOfNP) {
            return p;
        } else if (result % n == 0) {
            return result / n;
        } else {
            return -1;
        }
    }
}
