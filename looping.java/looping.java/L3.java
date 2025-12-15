import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 10;
        do {
            count++;
            n /= 10;
        } while (n > 0);
        System.out.println(count);
        sc.close();
    }
}
