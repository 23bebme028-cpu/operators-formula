package BasicOperations;

public class AbsoluteValue {
    public static void main(String[] args) {
        int n = -15;
        System.out.println("Absolute value: " + absoluteValue(n));
    }
    public static int absoluteValue(int n) {
        return Math.abs(n);
    }
}