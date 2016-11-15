package chess;

import java.util.Scanner;

public class Chess extends MainFunctions {
//

    public static Knight knight;
    public static Camel camel;

    public Chess() {
        super();
        knight = new Knight();
        camel = new Camel();
    }

    public static void main(String ar[]) {
        Chess obj = new Chess();
        obj.chessBoard();

        int source = 0;
        int dest = 0;

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter Source Location");
        source = cin.nextInt();
        System.out.println("Enter destination Location");
        dest = cin.nextInt();

        //obj.move(source, dest);
        
        //obj.chessBoard();
        
        switch (obj.currentCharacter(source, dest)) {
            case "KB1":
            case "KB2":
            case "KB3":
            case "KB4":
            case "KB5":
            case "KB6":
            case "KB7":
            case "KB8":
                knight.knightMove(source, dest);
                break;

            case "CLW":
            case "CRW":
                camel.camelMove(source, dest);
                break;
            default:
                System.out.println("No character to move");
                break;
        }

        obj.chessBoard();
    }
}
