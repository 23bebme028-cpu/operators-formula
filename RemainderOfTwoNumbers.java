package BasicOperations;

public class RemainderOfTwoNumbers {
    public static void main(String[] args) {
        int a = 10, b = 3;
        System.out.println("Remainder: " + remainder(a, b));
    }
    public static int remainder(int a, int b) {
        return a % b;
    }
}