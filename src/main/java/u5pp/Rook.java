package u5pp;

public class Rook extends ChessPiece {
    public Rook(ChessPiece[][] board, int row, int col, boolean isWhite){
        super(board, row, col, isWhite);
    }
    public boolean canMoveTo(int row, int col){
        //checks if in bounds
        if (row < 0 || row > 7 || col < 0 || col >7){
            return false; 
        }
        //if moving onto itslef
        if (getRow() == row && getColumn() == col){
            return false;
        }
        //if taking 
        if (board[row][col] != null && board[row][col].getIsWhite() != isWhite ){
            return false;
        }
        return true;
    }

}
