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
        if ((board[row][col] != null) && getIsWhite() == board[row][col].getIsWhite()){
            System.out.println(false + "moving onto own person");
            return false;
        }
        //Checks if it is moving to an invalid input
        boolean valid = true;
        if (row > this.row + 2 || row < this.row - 2 || col > this.col + 2 || col < this.col - 2){
            valid = false;
        }
        else if (Math.abs(getRow() - row) == Math.abs(getColumn() - col)){
            valid = false;
        }
        else if (getRow() == row || getColumn() == col){
            valid = false;
        }
        if (valid == false){
            return false;
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
