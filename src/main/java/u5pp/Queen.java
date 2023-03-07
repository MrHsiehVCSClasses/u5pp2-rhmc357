package u5pp;

public class Queen extends ChessPiece {
    public Queen(ChessPiece[][] board, int row, int col, boolean isWhite){
        super(board, row, col, isWhite);
    }
    public boolean canMoveTo(int row, int col){
        //checks if moving to a valid spot 
        //DOES NO WORk RN & WHY TEST FAILING
        // if (getRow() != row && getColumn() != col){
        //     if ((getRow() + row + getColumn() + col)% 2 != 0 ){
                
        //         return false;
        //     }
        // }
        int rowMath = Math.abs(getRow()-row );
        int colMath = Math.abs(getColumn()-col);
        if (rowMath != 0 && colMath != 0 && rowMath != colMath){
            return false;
        }
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
        //checks if taking or moving onto own player
        if (board[row][col] != null && getIsWhite() == board[row][col].getIsWhite()){
            System.out.println(false + "moving onto own person");
            return false;
        }
        
        if (getRow() < row && getColumn()<col){
            for (int cr = getRow() +1 ; cr < row; cr++){
                for (int cc = getColumn() + 1; cc < col; cc ++){
                    if (board[cr][cc] != null ){
                        System.out.println(false + "for loop 1 down right");
                        return false;
                    }
                }
            }
        }
        if (getRow() > row && getColumn()>col){
            for (int cr = getRow() -1; cr > row; cr --){
                for (int cc = getColumn() -1; cc > col; cc --){
                    if (board[cr][cc] != null){
                        System.out.println(false + "for loop 2 up left");
                        return false;
                    }
                }
            }
        }
        if (getRow() > row && getColumn()<col){
            for (int cr = getRow() -1 ; cr > row; cr --){
                for (int cc = getColumn() +1; cc < col; cc ++){
                    if (board[cr][cc] != null){
                        System.out.println( false + "for loop 3 up right");
                        return false;
                    }
                }
            }
        }
        if (getRow() < row && getColumn()>col){
            for (int cr = getRow() +1; cr < row; cr ++){
                for (int cc = getColumn()-1; cc > col; cc --){
                    if (board[cr][cc] != null){
                        System.out.println(false + "for loop 4 down left");
                        return false;
                    }
                }
            }
        }
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
        
        return true;
    }
    public String toString() {
        if (isWhite == true){
            return "Q";
        }
        else {
            return "q";
        }
    }
}
