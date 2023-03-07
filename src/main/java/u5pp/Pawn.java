package u5pp;

public class Pawn extends ChessPiece {
    public Pawn(ChessPiece[][] board, int row, int col, boolean isWhite){
        super(board, row, col, isWhite);
    }
    
    public boolean canMoveTo(int row, int col){
        
            
        
        int wob = 1;
        boolean isTaking = false;
        if (getIsWhite() == false){
            wob = -1;
        }
        if (row < 0 || row > 7 || col < 0 || col >7){
            return false; 
        }
        if(getColumn() != col && board [row] [col] != null && getIsWhite() != board [row] [col].getIsWhite()){
            isTaking = true;
        }
        if (isTaking == true){
            return true;
        }
        if (getColumn() != col && isTaking == false){
            return false;
        }
        if (getColumn() == col && board[row][col] != null){
            return false;
        }
        if (getRow() + wob == row && board[row][col] == null) {
            return true;
        }
        if (getRow() - wob == row){
            return false;
        }
        if (hasMoved == false && getRow() + wob * 2 == row && board [row] [col] == null){
            return true;
        }
    
        return false;
    
    }

    public void moveTo(int row, int col){
        ChessPiece temp = board [getRow()][getColumn()];
        board [getRow()][getColumn()] = null;
        board [row][col] = temp;
        hasMoved = true;
    }

    public String toString() {
        if (isWhite == true){
            return "P";
        }
        else {
            return "p";
        }
    }
}
