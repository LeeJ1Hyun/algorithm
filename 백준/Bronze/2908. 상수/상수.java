import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        String snum1, snum2;
        snum1 = String.valueOf(num1);
        snum2 = String.valueOf(num2);

        String rnum1 = new StringBuffer(snum1).reverse().toString();
        String rnum2 = new StringBuffer(snum2).reverse().toString();

        if(Integer.parseInt(rnum1) > Integer.parseInt(rnum2)) {
            System.out.println(rnum1);
        } else {
            System.out.println(rnum2);
        }
    }
}