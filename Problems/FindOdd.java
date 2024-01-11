package Problems;

import java.util.Arrays;

// source: https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java
public class FindOdd {
    public static int solve(int[] a) {
        Arrays.sort(a);

        int current = a[0];
        int count = 1;
        for (int index = 1; index < a.length; index++) {
            if (current == a[index]) {
                count++;
            } else {
                if (count % 2 != 0) {
                    break;
                } else {
                    current = a[index];
                    count = 1;
                }
            }
        }

        return current;
    }
}

/*
	:: Best solution

	public static int findIt(int[] A) {
  		int xor = 0;
    	for (int i = 0; i < A.length; i++) {
    		xor ^= A[i];
    	}
    	return xor;
  	}
*/
