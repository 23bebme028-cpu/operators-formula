public class Q1 {
    public static void main(String[] args) {
        double originalPrice = 1000;
        double discountPercent = 20;
        double discount = originalPrice * discountPercent / 100;
        double finalPrice = originalPrice - discount;
        System.out.println("Final Price: " + finalPrice);
    }
    
}
