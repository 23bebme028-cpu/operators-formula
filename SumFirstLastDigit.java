package BasicOperations;

public class SumFirstLastDigit {
    public static void main(String[] args) {
        int n = 123;
        System.out.println("Sum of first and last digit: " + sumFirstLastDigit(n));
    }
    public static int sumFirstLastDigit(int n) {
        int last = Math.abs(n) % 10;
        int first = Math.abs(n) / 100;
        return first + last;
    }
}