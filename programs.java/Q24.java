import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Main {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss");
        String timeString = now.format(f);
        System.out.println(timeString);
    }
}
