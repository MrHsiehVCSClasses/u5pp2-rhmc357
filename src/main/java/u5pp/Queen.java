package u5pp;

public class Queen extends ChessPiece {
    public Queen(ChessPiece[][] board, int row, int col, boolean isWhite){
        super(board, row, col, isWhite);
    }
    public boolean canMoveTo(int row, int col){
        //checks in bounds
        if (row < 0 || row > 7 || col < 0 || col >7){
            return false; 
        }
        //checks if moving ontro itself
        if (getRow() == row && getColumn() == col){
            return false;
        }
        return true;
    }
}
