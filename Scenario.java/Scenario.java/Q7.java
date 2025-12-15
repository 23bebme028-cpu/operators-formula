public class Q7 {
    public class DistributeCandies {
    public static void main(String[] args) {
        int totalCandies = 48;
        int people = 6;
        int perPerson = totalCandies / people;
        int remaining = totalCandies % people;
        System.out.println("Per person: " + perPerson + ", Remaining: " + remaining);
    }
}}
