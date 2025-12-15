public class Q15 {
   public class ATMCurrency {
    public static void main(String[] args) {
        int amount = 2470;
        int notes2000 = amount / 2000;
        amount %= 2000;
        int notes500 = amount / 500;
        amount %= 500;
        int notes200 = amount / 200;
        amount %= 200;
        int notes100 = amount / 100;
        System.out.println("2000: " + notes2000 + ", 500: " + notes500);
        System.out.println("200: " + notes200 + ", 100: " + notes100);
    }
} 
}
