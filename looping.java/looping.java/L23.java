import java.util.Scanner;

public class L23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // base
        int m = sc.nextInt();   // exponent

        long res = 1;
        for (int i = 0; i < m; i++) {
            res *= n;
        }
        System.out.println(res);
        sc.close();
    }
}
