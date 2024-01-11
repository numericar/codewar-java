package Problems;

// source: https://www.codewars.com/kata/5552101f47fc5178b1000050/train/java

/*
    Armstrong number
*/
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
        if (result == sumOfNP) { // ถ้าหาก result มีค่าเท่ากับ sumOfNP, เราสามารถ return p ได้เลย
            return p;
        } else if (result % n == 0) {
            /* หาตัวเลขที่ใช้ในการคูณเพื่อที่จะได้ผลลัพธ์ โดยเราสามารถนำ result / n เพื่อหาว่าเลขอะไรที result คูณแล้วมีค่าเท่ากับ sumOfNP กันแล้วได้ result */
            return result / n;
        } else {
            return -1;
        }
    }
}
