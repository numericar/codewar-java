package Problems;

import java.util.Arrays;

//source: https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/java
public class DescendingOrder {
    public static int sortDesc(int num) {
        String text = Integer.toString(num);
        int[] numbers = new int[text.length()];

        // Add number in text to numbers
        for (int index = 0; index < text.length(); index++) {
            numbers[index] = (text.charAt(index) - '0');
        }
        Arrays.sort(numbers);

        // Reverse the integer array
        int length = numbers.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[length - i - 1];
            numbers[length - i - 1] = temp;
        }

        // Result
        String result = "";
        for (int number : numbers) {
            result += Integer.toString(number);
        }

        return Integer.parseInt(result);
    }
}

/*
 	:: Best solution

 	public class DescendingOrder {
    	public static int sortDesc(final int num) {
        	String[] array = String.valueOf(num).split("");
        	Arrays.sort(array, Collections.reverseOrder());
        	return Integer.valueOf(String.join("", array));
    	}
	}
*/
