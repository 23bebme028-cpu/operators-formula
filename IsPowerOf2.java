package BasicOperations;

public class IsPowerOf2 {
    public static void main(String[] args) {
        int n = 8;
        System.out.println("Is power of 2? " + isPowerOf2(n));
    }
    public static boolean isPowerOf2(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}