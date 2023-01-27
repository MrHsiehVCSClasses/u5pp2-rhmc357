package u5pp;

public class King extends ChessPiece {
    //construstor
    public King(ChessPiece[][] board, int row, int col, boolean isWhite){
        super(board, row, col, isWhite);
    }
    public boolean canMoveTo(int row, int col){
        //in bounds
        if (row < 0 || row > 7 || col < 0 || col >7){
            return false; 
        }
        //same spot its on
        if (getRow() == row && getColumn() == col){
            return false;
        }
        //if it is taking 
        if (getIsWhite() != isWhite){
            return true;
        }
        //moving onto its own color
        if (board [row][col] != null && board [row][col].getIsWhite() == getIsWhite()){
            return false;
        }
        //moving in the only places around it  
        if ((col == getColumn() + 1 || col == getColumn() - 1  || col == getColumn()) && (row == getRow() + 1 || row == getRow() - 1 || row == getRow())){
            return true;
        }
        char ud = 'K';
        if (getIsWhite() == true){
            ud = 'k';
        }
        if ((getColumn() + 1 == ud||getColumn() - 1  == ud) && (getRow() + 1 == ud|| getRow() - 1 == ud)){
            return false;
        }
        
        return false;
    }
    //actually moves the piece
    public void moveTo(int row, int col){
        ChessPiece temp = board [getRow()][getColumn()];
        board [getRow()][getColumn()] = temp;
        board [row][col] = null;
        hasMoved = true;
    }
    //says if K or k
    public String toString() {
        if (isWhite == true){
            return "K";
        }
        else {
            return "k";
        }
    }
}
