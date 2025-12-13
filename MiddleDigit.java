package BasicOperations;

public class MiddleDigit {
    public static void main(String[] args) {
        int n = 123;
        System.out.println("Middle digit: " + middleDigit(n));
    }
    public static int middleDigit(int n) {
        return (Math.abs(n) / 10) % 10;
    }
}