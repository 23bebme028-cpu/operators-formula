package BasicOperations;

public class AreNumbersEqual {
    public static void main(String[] args) {
        int a = 5, b = 5;
        System.out.println("Are numbers equal? " + areEqual(a, b));
    }
    public static boolean areEqual(int a, int b) {
        return a == b;
    }
}