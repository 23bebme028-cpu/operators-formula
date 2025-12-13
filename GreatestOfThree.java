package BasicOperations;

public class GreatestOfThree {
    public static void main(String[] args) {
        int a = 3, b = 9, c = 5;
        System.out.println("Greatest: " + greatest(a, b, c));
    }
    public static int greatest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}