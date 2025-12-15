import java.util.Scanner;

public class L13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int root = (int) Math.sqrt(n);
        System.out.println(root * root == n ? "Perfect Square" : "Not Perfect Square");
        sc.close();
    }
}
