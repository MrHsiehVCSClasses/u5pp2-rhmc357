package u5pp;

public class Pawn extends ChessPiece {
    public Pawn(ChessPiece[][] board, int row, int col, boolean isWhite){
        super(board, row, col, isWhite);
    }
    
    public boolean canMoveTo(int row, int col){
        //not moving onto its own guy
        int wob = 1;
        boolean isTaking = false;
        if (getIsWhite() == false){
            wob = -1;
        }
        //in bounds
        if (row < 0 || row > 7 || col < 0 || col >7){
            return false; 
        }
        //not moving onto other guys
        if(getColumn() != col && board [row] [col] != null && getIsWhite() != board [row] [col].getIsWhite()){
            isTaking = true;
        }
        if (isTaking == true){
            return true;
        }
        //checks if moving to invalid spot
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
        //math to see if taking or moving onto own guy
        if (hasMoved == false && getRow() + wob * 2 == row && board [row] [col] == null){
            return true;
        }
        return false;
    }

    //actually moves the piece
    public void moveTo(int row, int col){
        ChessPiece temp = board [getRow()][getColumn()];
        board [getRow()][getColumn()] = null;
        board [row][col] = temp;
        hasMoved = true;
    }

    //prints p or P
    public String toString() {
        if (isWhite == true){
            return "P";
        }
        else {
            return "p";
        }
    }
}
