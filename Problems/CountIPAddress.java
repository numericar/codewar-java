package Problems;

public class CountIPAddress {
    public static long solve(String start, String end) {
        long result = 0;
        final int MAX_OCLET = 256;

        String[] startOclets = start.split("[.]");
        String[] endOclets = end.split("[.]");

        for (int index = startOclets.length - 1; index >= 0; index--) {
            int startOclet = Integer.parseInt(startOclets[index]);
            int endOclet = Integer.parseInt(endOclets[index]);

            // boolean isValueEqual = startOclet == endOclet;
            // if (isValueEqual) continue;

            // System.out.println("Start oclet " + startOclet + "\nEnd oclet " + endOclet);

            boolean isLastIndex = isLastIndex(index, (startOclets.length - 1));
            boolean isValueMoreThanZero = isValueMoreThanZero(endOclet);
            boolean isEqual = startOclet == endOclet;
            if (!isLastIndex && isValueMoreThanZero && !isEqual) {
                result += (MAX_OCLET - endOclet) + (startOclet) + 1;
            } else {
                result += endOclet - startOclet;
            }
        }

        return result;
    }

    private static boolean isLastIndex(int currentIndex, int lastIndex) {
        return currentIndex == lastIndex;
    }

    private static boolean isValueMoreThanZero(int number) {
        return number > 0;
    }
}
