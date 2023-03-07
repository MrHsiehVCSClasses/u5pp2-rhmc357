package u5pp;

//import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello! :)\n" + 
        "Welcome to the unit 5 programming project!\n"+
        "Take a look at the README, and the txt files to start\n" + 
        "Good luck!");
        ChessPiece[][] board = new ChessPiece[8][8];
        board[5][5] = new Rook(board, 5, 5, true);
        board[4][4] = new Rook(board, 5, 7, false);
        board[5][5].canMoveTo(5,6);
        board[0][0] = new King(board, 0, 0, false);
        board[1][2] = new King(board, 1, 2, true);
        board[0][0].canMoveTo(0, 1);
    }
}