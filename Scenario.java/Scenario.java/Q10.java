public class Q10 {
    public static void main(String[] args) {
        double basic = 30000;
        double hra = basic * 20 / 100;
        double da = basic * 10 / 100;
        double totalSalary = basic + hra + da;
        System.out.println("Total Salary: " + totalSalary);
    }
}
