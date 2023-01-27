package u5pp;

public class Knight extends ChessPiece {
    //constructor
    public Knight(ChessPiece[][] board, int row, int col, boolean isWhite){
        super(board, row, col, isWhite);
    }
    public boolean canMoveTo(int row, int col){
        //in bounds
        if (row < 0 || row > 7 || col < 0 || col >7){
            return false; 
        }
        //not moving onto itself
        if (getRow() == row && getColumn() == col){
            return false;
        }
        //not moving onto one of its own guys
        if (getIsWhite() == isWhite){
            return false;
        }
        //check if it is stealing 
        if (board[row][col] != null || board[row][col].getIsWhite() == getIsWhite()){
            return false;
        }
        //moving in its L shape
        if (getRow() + 1 == row && getColumn() + 2== col ||getRow() - 1 == row && getColumn()-2 == col ||getRow() - 1 == row && getColumn()+2 == col ||getRow() + 1 == row && getColumn()-2 == col ||getRow() + 2 == row && getColumn()+1 == col ||getRow() -2 == row && getColumn()-1 == col ||getRow() + 2 == row && getColumn()-1 == col ||getRow() -2 == row && getColumn()+1 == col ){
            return true;
        }
        return true;
    }
    //to string says in b or w
    public String toString() {
        if (isWhite == true){
            return "N";
        }
        else {
            return "n";
        }
    }
}
