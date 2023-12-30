package Problems;

import java.util.Arrays;

// source: https://www.codewars.com/kata/585d7d5adb20cf33cb000235/train/java
public class FindUniq {
    public static double solve(double[] arr) {
        Arrays.sort(arr);

        double result = arr[0];

        for (int current = 0; current < arr.length; current++) {
            int duplicateCount = 0;
            int skipTo = 0;

            for (int next = current; next < arr.length; next++) {
                if (arr[current] == arr[next]) {
                    duplicateCount++;
                    skipTo = next;
                } else {
                    break;
                }
            }

            if (duplicateCount > 1) {
                current = skipTo;
            } else {
                result = arr[current];
                break;
            }
        }

        return  result;
    }
}

/*
    :: Best solution

    public static double findUniq(double[] arr) {
      Arrays.sort(arr);
      return arr[0] == arr[1] ? arr[arr.length-1]:arr[0];
    }
*/
