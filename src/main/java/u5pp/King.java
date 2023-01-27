package u5pp;

public class King extends ChessPiece {
    public King(ChessPiece[][] board, int row, int col, boolean isWhite){
        super(board, row, col, isWhite);
    }
    public boolean canMoveTo(int row, int col){
        if (row < 0 || row > 7 || col < 0 || col >7){
            return false; 
        }
        if (getRow() == row && getColumn() == col){
            return false;
        }
        if (getIsWhite() != isWhite){
            return true;
        }
        if (board [row][col] != null && board [row][col].getIsWhite() == getIsWhite()){
            return false;
        }
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
    public void moveTo(int row, int col){
        ChessPiece temp = board [getRow()][getColumn()];
        board [getRow()][getColumn()] = temp;
        board [row][col] = null;
        hasMoved = true;
    }
    public String toString() {
        if (isWhite == true){
            return "K";
        }
        else {
            return "k";
        }
    }
}
