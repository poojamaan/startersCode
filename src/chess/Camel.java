package chess;

public class Camel extends MainFunctions {

    void camelMove(int p_source, int p_dest) {

        super.move(p_source, p_dest);
        
        String temp = "";
        if ("CRW".equalsIgnoreCase(chessBoard[tS_i][tS_j])) {
            if ((tS_val - tD_val) % 9 == 0) {
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if (i == tS_i && j == tS_j) {
                            temp = chessBoard[i][j];
                            chessBoard[tD_i][tD_j] = chessBoard[i][j];
                            chessBoard[i][j] = "   ";
                        }
                    }
                }
            } else {
                System.out.println("Invalid Move");
            }
        } else if ("CLW".equalsIgnoreCase(chessBoard[tS_i][tS_j])) {
            if ((tS_val - tD_val) % 7 == 0) {
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if (i == tS_i && j == tS_j) {
                            temp = chessBoard[i][j];
                            chessBoard[tD_i][tD_j] = chessBoard[i][j];
                            chessBoard[i][j] = "   ";
                        }
                    }
                }
            } else {
                System.out.println("Invalid Move");
            }
        } else {
            System.out.println("Invalid Move");
        }
    }
}
