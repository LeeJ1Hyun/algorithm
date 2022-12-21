import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        System.out.println(fibonacci(N));
    }
    
    static int fibonacci(int N) {
        if(N == 0) return 0;
        if(N == 1) return 1;
        
        return fibonacci(N - 2) + fibonacci(N - 1);
    }
}