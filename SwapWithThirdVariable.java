package BasicOperations;

public class SwapWithThirdVariable {
    public static void main(String[] args) {
        int a = 8, b = 3;
        swap(a, b);
    }
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + ", b = " + b);
    }
}