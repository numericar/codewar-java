package Problems;

public class RgbToHex {
    public static String solve(int r, int g, int b) {
        // make r, g, b to array
        int[] numbers = { r, g, b };

        // use StringBuilder for result and less memory
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < numbers.length; index++)
        {
            // convert number to hexadecimal
            String hex = ConvertToHex(numbers[index]);
            result.append(hex);
        }

        return result.toString();
    }

    // Math argorithm from: https://www.youtube.com/watch?v=Ic3iPVeiVZ0
    private static String ConvertToHex(int number) {
        // if number more than 255, return "FF"
        if (number >= 255) return "FF";

        // if number less than 0, return "00"
        if (number <= 0) return "00";

        // group of hexadecimal
        char[] hexIndex = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

        // result of divide per round
        int divideResult = number;

        // process has multiple concat string, use StringBuilder for less menory
        StringBuilder result = new StringBuilder();

        // for next round, divideResult must be greater than 0
        while (divideResult > 0)
        {
            // store temp of divide result
            int divideTemp = divideResult / 16;

            // get value in group of hexadecimal, index is fraction of divide
            result.append(hexIndex[divideResult - (16 * divideTemp)]);

            // move value in divideTemp to divideResult
            divideResult = divideTemp;
        }

        // if length of result equal 1, append 0 to result
        // because result cannot have length equal to 1
        if (result.length() == 1) result.append('0');

        // reverse before return result
        return result.reverse().toString();
    }
}
