public class Q13 {
    public class Cuboid {
    public static void main(String[] args) {
        double l = 5, w = 3, h = 2;
        double surfaceArea = 2 * (l*w + w*h + h*l);
        double volume = l * w * h;
        System.out.println("Cuboid - SA: " + surfaceArea + ", Vol: " + volume);
    }
}
}