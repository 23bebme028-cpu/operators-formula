package BasicOperations;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        int a = 4, b = 7, c = 9;
        System.out.println("Average: " + average(a, b, c));
    }
    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
}