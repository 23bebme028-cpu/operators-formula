import java.util.Scanner;

public class L9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = a, y = b;
        while (y != 0) {
            int t = y;
            y = x % y;
            x = t;
        }
        int gcd = x;
        int lcm = (a * b) / gcd;
        System.out.println(lcm);
        sc.close();
    }
}
