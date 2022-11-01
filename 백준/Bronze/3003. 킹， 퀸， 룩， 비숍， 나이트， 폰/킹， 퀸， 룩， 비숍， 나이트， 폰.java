import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int king = 1, queen = 1, rook = 2, bishop = 2, knight = 2, pawn = 8;
        
        king = king - sc.nextInt();
        queen = queen - sc.nextInt();
        rook = rook - sc.nextInt();
        bishop = bishop - sc.nextInt();
        knight = knight - sc.nextInt();
        pawn = pawn - sc.nextInt();
        
        System.out.print(king + " " + queen + " " + rook + " " + bishop + " " + knight + " " + pawn);
    }
}