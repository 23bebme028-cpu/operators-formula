public class Q13 {
    public static void main(String[] args) {
        int totalMangoes = 20;
        double pricePerMango = 50;
        int freeMangoes = totalMangoes / 4;
        int paidMangoes = totalMangoes - freeMangoes;
        double totalAmount = paidMangoes * pricePerMango;
        System.out.println("Total Amount: " + totalAmount);
    }

}
