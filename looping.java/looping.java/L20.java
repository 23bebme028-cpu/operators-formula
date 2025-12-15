import java.util.Scanner;

public class L20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sq = n * n;
        int pow = 1;
        int temp = n;
        while (temp > 0) {
            pow *= 10;
            temp /= 10;
        }
        int last = sq % pow;
        System.out.println(last == n ? "Automorphic" : "Not Automorphic");
        sc.close();
    }
}
