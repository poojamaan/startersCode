/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

public class MainFunctions {

//    Knight knight;
//    Camel camel;
//    Elephant elephant;
//    Horse horse;
//    Queen queen;
//    King king;
    public int mat[][];
    public String[][] chessBoard = {
        {"ELB", "HLB", "CLB", "Q-B", "K-B", "CRB", "HRB", "ERB"},
        {"KB1", "KB2", "KB3", "KB4", "KB5", "KB6", "KB7", "KB8"},
        {"   ", "   ", "   ", "   ", "   ", "   ", "   ", "   "},
        {"   ", "   ", "   ", "   ", "   ", "   ", "   ", "   "},
        {"   ", "   ", "   ", "   ", "   ", "   ", "   ", "   "},
        {"   ", "   ", "   ", "   ", "   ", "   ", "   ", "   "},
        {"KW1", "KW2", "KW3", "KW4", "KW5", "KW6", "KW7", "KW8"},
        {"ELW", "HLW", "CLW", "K-W", "Q-W", "CRW", "HRW", "ERW"}
    };

    public int tS_i = 0;
    public int tS_j = 0;
    public int tS_val = 0;
    public int tD_i = 0;
    public int tD_j = 0;
    public int tD_val = 0;

    public MainFunctions() {
    //    knight = new Knight();
        //   camel = new Camel();
        mat = new int[8][8];

        char storeVal = 1;
        //int storeNum;  // for display number on chessboard
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                mat[i][j] = storeVal++;
            }
        }
    }

    public void chessBoard() {

        System.out.println("\n");
        for (int k = 0; k < 50; k++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {
                System.out.print(" | ");
                //if(mat[i][j] < 10)
                //System.out.print(chessBoard[i][j]+ "");
                //else
                System.out.print(chessBoard[i][j]);
                if (j == 7) {
                    System.out.print(" | ");
                }
            }
            System.out.println("");
            for (int k = 0; k < 50; k++) {
                System.out.print("-");
            }
            System.out.println("");

        }

    }

    void move(int p_source, int p_dest) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (mat[i][j] == p_source) {
                    tS_i = i;
                    tS_j = j;
                    tS_val = p_source;
                } else if (mat[i][j] == p_dest) {
                    tD_i = i;
                    tD_j = j;
                    tD_val = p_dest;
                }
            }
        }

    }

    String currentCharacter(int p_source, int p_dest) {

        move(p_source, p_dest);

        return chessBoard[tS_i][tS_j];
        
    }

}
