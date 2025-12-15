import java.util.Scanner;

public class L22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = 0;
        int times = Math.abs(b);
        for (int i = 0; i < times; i++) {
            res += a;
        }
        if (b < 0) res = -res;

        System.out.println(res);
        sc.close();
    }
}
