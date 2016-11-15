
package chess;

public class Knight extends MainFunctions{
   
    void knightMove(int p_source, int p_dest) {
        
        super.move(p_source, p_dest);
        
        String temp = "";
        if((tS_val - tD_val) % 8 == 0) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if(i == tS_i && j == tS_j) {
                        temp = chessBoard[i][j];
                        chessBoard[tD_i][tD_j] = chessBoard[i][j];
                        chessBoard[i][j] = "   ";
                    }    
                }
            }
        }
        else {
            System.out.println("Invalid Move");
        }
    }
    
}
