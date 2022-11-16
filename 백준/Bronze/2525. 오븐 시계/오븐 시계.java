import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hour = sc.nextInt();
        int nowMin = sc.nextInt();
        int time = sc.nextInt();
        int sumMin = 0;
        
        sumMin = hour * 60 + nowMin + time;
        hour = (sumMin / 60) % 24;
        nowMin = sumMin % 60;
        
        System.out.print(hour + " " + nowMin);
    }
}