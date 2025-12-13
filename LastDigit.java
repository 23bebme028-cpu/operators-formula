package BasicOperations;

public class LastDigit {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println("Last digit: " + lastDigit(n));
    }
    public static int lastDigit(int n) {
        return Math.abs(n) % 10;
    }
}