import Problems.ArrayDiff;

public class Main {
    public static void main(String[] args) {
        int[] result = ArrayDiff.solve(new int[] {1, 2, 2, 2, 3}, new int[] {2});
        for (int number : result) {
            System.out.println(number);
        }
    }
}