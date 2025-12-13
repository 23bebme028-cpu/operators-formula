package BasicOperations;

public class AllButLastDigit {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println("All but last digit: " + allButLastDigit(n));
    }
    public static int allButLastDigit(int n) {
        return Math.abs(n) / 10;
    }
}