public class Q14 {
    public class PensDiscount {
    public static void main(String[] args) {
        int totalPens = 15;
        double pricePerPen = 10;
        int groups = totalPens / 5;
        int paidPens = groups * 3;
        double totalAmount = paidPens * pricePerPen;
        System.out.println("Total Amount: " + totalAmount);
    }
}}
