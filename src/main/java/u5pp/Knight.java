package u5pp;

public class Knight extends ChessPiece {
    public Knight(ChessPiece[][] board, int row, int col, boolean isWhite){
        super(board, row, col, isWhite);
    }
    public boolean canMoveTo(int row, int col){
        if (row < 0 || row > 7 || col < 0 || col >7){
            return false; 
        }
        if (getRow() == row && getColumn() == col){
            return false;
        }
        if (getIsWhite() == isWhite){
            return false;
        }
        if (board[row][col] != null || board[row][col].getIsWhite() == getIsWhite()){
            return false;
        }
        if (getRow() + 1 == row && getColumn() + 2== col ||getRow() - 1 == row && getColumn()-2 == col ||getRow() - 1 == row && getColumn()+2 == col ||getRow() + 1 == row && getColumn()-2 == col ||getRow() + 2 == row && getColumn()+1 == col ||getRow() -2 == row && getColumn()-1 == col ||getRow() + 2 == row && getColumn()-1 == col ||getRow() -2 == row && getColumn()+1 == col ){
            return true;
        }
        return true;
    }
    public String toString() {
        if (isWhite == true){
            return "N";
        }
        else {
            return "n";
        }
    }
}
