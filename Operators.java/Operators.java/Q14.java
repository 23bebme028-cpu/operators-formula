public class Q14 {
    public static class Sphere {
        public static void main(String[] args) {
            double r = 3;
            double surfaceArea = 4 * Math.PI * r * r;
            double volume = (4.0/3.0) * Math.PI * Math.pow(r, 3);
            System.out.println("Sphere - SA: " + surfaceArea + ", Vol: " + volume);
        }
    }
}