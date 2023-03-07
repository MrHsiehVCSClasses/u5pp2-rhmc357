package u5pp;

public class ChessPiece {
    //creates veriables
    ChessPiece[][] board; 
    int row;
    int col;
    boolean isWhite;
    boolean hasMoved;

    public ChessPiece(ChessPiece[][] board, int row, int col, boolean isWhite){
        //sets the values of the variables
        this.board = board;
        this.row = row;
        this.col = col;
        this.isWhite = isWhite;
    }
    //Very self explanitory just gets the variables
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

    //base function doesnt rly do much
    public boolean canMoveTo(int row, int col){
        //not onto itself
        if (getRow() == row && getColumn() == col){
            return false;
        }
        //in bounds
        if (row < 0 || row > 7 || col < 0 || col >7){
            return false; 
        }
        //not onto own player
        if (board[row][col] != null && getIsWhite() == board[row][col].getIsWhite()){
            return false;
        }
        return true;
    }

    //moves to the specified space
    public void moveTo(int row, int col){
        ChessPiece temp = board [getRow()][getColumn()];
        board [getRow()][getColumn()] = null;
        board [row][col] = temp;
        hasMoved = true;
    }

    //Prints specified piece to string
    public String toString(){
        return board [row][col].toString();
    }
}
