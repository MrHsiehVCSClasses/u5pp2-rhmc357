package u5pp;

public class Rook extends ChessPiece {
    public Rook(ChessPiece[][] board, int row, int col, boolean isWhite){
        super(board, row, col, isWhite);
    }

    public boolean canMoveTo(int row, int col){
        //checks in bounds
        if (row < 0 || row > 7 || col < 0 || col >7){
            System.out.println(false + "out of bounds");
            return false; 
        }
        //checks if moving on same space
        if (getRow() == row && getColumn() == col){
            System.out.println(false + "same space");
            return false;
        }
        //check if not moving straight
        if (getRow() != row && getColumn() != col){
            System.out.println(false + "not straight move");
            return false;
        }
        //checks if taking or moving onto own player
        if (board[row][col] != null && getIsWhite() == board[row][col].getIsWhite()){
            System.out.println(false + "moving onto own person");
            return false;
        }
        //can only move up and down or side to side
        if (getRow() < row){
            for (int cr = getRow() +1 ; cr < row; cr++){
                if (board[cr][col] != null ){
                    System.out.println(false + "for loop 1 down right");
                    return false;
                }
            }
        }
        if (getRow() > row){
            for (int cr = getRow() -1; cr > row; cr --){
                if (board[cr][col] != null){
                    System.out.println(false + "for loop 2 up left");
                    return false;
                }
            }
        }
        if (getColumn()<col){
            for (int cc = getColumn() +1; cc < col; cc ++){
                if (board[row][cc] != null){
                    System.out.println( false + "for loop 3 up right");
                    return false;
                }
            }
        }
        if (getColumn()>col){
            for (int cc = getColumn()-1; cc > col; cc --){
                if (board[row][cc] != null){
                    System.out.println(false + "for loop 4 down left");
                    return false;
                }
            }
        }
        System.out.println(true + "end ");
        return true;
    }

    //print w or b
    public String toString() {
        if (isWhite == true){
            return "R";
        }
        else {
            return "r";
        }
    }
}
