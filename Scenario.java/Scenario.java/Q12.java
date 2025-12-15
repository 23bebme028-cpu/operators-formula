public class Q12 {
    public class CostPrice {
    public static void main(String[] args) {
        double sellingPrice = 900;
        double lossPercent = 10;
        double costPrice = sellingPrice / (1 - lossPercent / 100);
        System.out.println("Cost Price: " + costPrice);
    }
}
}