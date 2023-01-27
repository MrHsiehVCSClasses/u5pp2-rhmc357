package u5pp;

public class ChessPiece {
    ChessPiece[][] board; 
    int row;
    int col;
    boolean isWhite;
    boolean hasMoved;

    public ChessPiece(ChessPiece[][] board, int row, int col, boolean isWhite){
        this.board = board;
        this.row = row;
        this.col = col;
        this.isWhite = isWhite;
    }
    public ChessPiece[][] getBoard(){
        return board;
    }
    public int getRow(){
        return row;
    }
    public int getColumn(){
        return col;
    }
    public boolean getIsWhite(){
        return isWhite;
    }

    public boolean canMoveTo(int row, int col){
        return true;
    }
    public void moveTo(int row, int col){
        ChessPiece temp = board [getRow()][getColumn()];
        board [getRow()][getColumn()] = null;
        board [row][col] = temp;
        hasMoved = true;
    }
    public String toString(){
        return "Row:" + row + "column: " + col;
    }
}
