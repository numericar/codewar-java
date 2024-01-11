package Problems;

import java.util.ArrayList;

// source: https://www.codewars.com/kata/523f5d21c841566fde000009/train/java
public class ArrayDiff {
    public static int[] solve(int[] a, int[] b) {
        ArrayList<Integer> numberGroup = new ArrayList<>();

        for (int aNumber : a) {
            boolean hasInB = false;

            for (int bNumber : b) {
                if (aNumber == bNumber) {
                    hasInB = true;
                    break;
                }
            }

            if (!hasInB) {
                numberGroup.add(aNumber);
            }
        }

        int[] result = new int[numberGroup.size()];
        for (int i = 0; i < numberGroup.size(); i++) {
            result[i] = numberGroup.get(i);
        }

        return result;
    }
}

/*
    :: Best solution

    public static int[] arrayDiff(int[] a, int[] b) {
        return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
    }
*/
