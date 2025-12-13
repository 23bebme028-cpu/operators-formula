package BasicOperations;

public class PositiveOrNegative {
    public static void main(String[] args) {
        int n = -7;
        System.out.println("Number is: " + positiveOrNegative(n));
    }
    public static String positiveOrNegative(int n) {
        if (n > 0) return "Positive";
        else if (n < 0) return "Negative";
        else return "Zero";
    }
}