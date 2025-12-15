import java.util.Scanner;

public class L18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean buzz = (n % 7 == 0) || (n % 10 == 7);
        System.out.println(buzz ? "Buzz" : "Not Buzz");
        sc.close();
    }
}
