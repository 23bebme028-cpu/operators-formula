import java.util.Scanner;

public class L7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n, digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        int sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            int p = 1;
            for (int i = 0; i < digits; i++) {
                p *= d;
            }
            sum += p;
            temp /= 10;
        }

        System.out.println(sum == n ? "Armstrong" : "Not Armstrong");
        sc.close();
    }
}
