public class Q15 {
    public static void main(String[] args) {
        double r = 4, h = 10;
        double surfaceArea = 2 * Math.PI * r * (r + h);
        double volume = Math.PI * r * r * h;
        System.out.println("Cylinder - SA: " + surfaceArea + ", Vol: " + volume);
    }
}
