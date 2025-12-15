import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        int key = marks / 10;
        String grade;

        switch (key) {
            case 10:
            case 9:
            case 8:
                grade = "A";
                break;
            case 7:
            case 6:
                grade = "B";
                break;
            case 5:
            case 4:
                grade = "C";
                break;
            default:
                grade = "Fail";
        }

        System.out.println("Grade: " + grade);

        sc.close();
    }
}
