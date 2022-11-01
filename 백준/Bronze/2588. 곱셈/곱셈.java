import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        
        int first = num1 * (num2 % 10);
        int second = num1 * ((num2 / 10) % 10);
        int third = num1 * ((num2 / 100) % 10);
        
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(num1 * num2);
    }
}