import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        
        if (min < 45) {
            hour--;
            min = min - 45 + 60;
            
            if (hour < 0) {
                hour = 23;
            }
        } else if (min >= 45) {
            min = min - 45;
        }
        
        System.out.print(hour + " " + min);
    }
}