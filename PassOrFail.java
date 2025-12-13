package BasicOperations;

public class PassOrFail {
    public static void main(String[] args) {
        int marks = 45;
        System.out.println("Result: " + passOrFail(marks));
    }
    public static String passOrFail(int marks) {
        return marks >= 33 ? "Pass" : "Fail";
    }
}