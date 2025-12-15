import java.util.Scanner;

public class L21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Not Power of 3");
        } else {
            while (n % 3 == 0) {
                n /= 3;
            }
            System.out.println(n == 1 ? "Power of 3" : "Not Power of 3");
        }
        sc.close();
    }
}
