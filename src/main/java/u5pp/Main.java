package u5pp;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello! :)\n" + 
        "Welcome to the unit 5 programming project!\n"+
        "Take a look at the README, and the txt files to start\n" + 
        "Good luck!");
        // Scanner myScanner = new Scanner(System.in);
        // InputHelper myInputHelper = new InputHelper(myScanner);
        // myInputHelper.getChessLocation("check");
        // ChessPiece[][] a = new board{{R, N , B , Q , K , B , N , R}
        //                             {P , P , P , P , P , P , P , P}
        //                             { null, null, null, null, null, null, null, null}
        //                             { null, null, null, null, null, null, null, null}
        //                             }
        //                             ;
        ChessPiece[][] board = new ChessPiece[8][8];
        board[5][5] = new Bishop(board, 5, 5, true);
        board[5][5].canMoveTo(5,1);
    }
}