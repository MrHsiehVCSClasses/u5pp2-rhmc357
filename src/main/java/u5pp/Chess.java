package u5pp;

import java.util.Scanner;

public class Chess {
    /**
     * Used to print a chess board out.
     */
    public static String boardToString(ChessPiece[][] board) {
        String output = "";
        output += " ".repeat(3);
        for(int i = 0; i < 8; i++) {
            output += " " + (char)('a' + i) + "  ";
        }
        output += "\n";
        output += "  " + "┌───" + "┬───".repeat(7) + "┐";
        output += "\n";
        for(int r = 0; r < board.length; r++) {
            output += (r)+1 + " │";
            for(int c = 0; c < board[r].length; c++) {
                output += " ";
                if(board[r][c] == null) {
                    output += " ";
                } else {
                    output += board[r][c];
                }
                output += " │";
            }
            output += (" " + (r+1));
            output += "\n";
            if(r == board.length-1) {
                output += "  " + "└───" + "┴───".repeat(7) + "┘";
            } else {
                output += "  " + "├───" + "┼───".repeat(7) + "┤";
            }
            output += "\n";
        }
        output += " ".repeat(3);
        for(int i = 0; i < 8; i++) {
            output += " " + (char)('a' + i) + "  ";
        }
        return output;
    }

    void play(Scanner scanner){
        //Nope
    }

    //uses instance of to check what color has kings and if they both have a king its a tie
    public static int getWinner(ChessPiece[][] board){
        boolean whiteHasKing = false;
        boolean blackHasKing = false;
        for (int row = 0; row < board.length; row ++){
            for(int col = 0; col < board[row].length; col++){
                if (board[row][col] == null){
                    continue;
                }
                if (board[row][col] .toString() .equals("K") ){
                    whiteHasKing = true;
                }
                if (board[row][col] .toString() .equals("k")){
                    blackHasKing = true;
                }
            }
        }
        //returns the winner
        if(whiteHasKing == true && blackHasKing == false){
            return 1;
        }
        else if (blackHasKing == true && whiteHasKing == false){
            return -1;
        }
        else {//if (whiteHasKing == true && blackHasKing == true || whiteHasKing == false && blackHasKing == false)
            return 0;
        }
    }
}
