import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter time (HH:MM:SS): ");
        String time = scanner.nextLine();

        System.out.print("Enter seconds to add: ");
        int addSeconds = scanner.nextInt();

        String parts[] = time.split(":");
        
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);

        int totalSeconds = hours * 60 * 60 + minutes * 60 + seconds + addSeconds;
        
        int newHours = (totalSeconds / 3600) % 24;
        int newMinutes = (totalSeconds / 60) % 60;
        int newSeconds = (totalSeconds % 60);

        System.out.println("New time:");
        System.out.printf("%02d:%02d:%02d", newHours, newMinutes, newSeconds);
    }
}
