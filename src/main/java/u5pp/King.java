package u5pp;

import java.util.ArrayList;

public class King extends ChessPiece {
    //construstor
    public King(ChessPiece[][] board, int row, int col, boolean isWhite){
        super(board, row, col, isWhite);
    }
    public boolean canMoveTo(int row, int col){
        //in bounds
        if (row < 0 || row > 7 || col < 0 || col >7){
            System.out.println("oob");
            return false; 
        }
        //same spot its on
        if (getRow() == row && getColumn() == col){
            System.out.println("same spot");
            return false;
        }
        //checks if on own color
        if (board [row][col] != null && board [row][col].getIsWhite() == getIsWhite()){
            System.out.println("own color not taking");
            return false;
        }
        // for (int r = row -1; r<row + 1 && r> row -1 && r != row; r++ ){
        //     for (int c = col -1; c<col + 1 && c> col-1 && c != col; c++){
        //         if (board [r][c].toString() .equals("K" )|| board [r][c].toString() .equals( "k" )){
        //             System.out.println("nope cant with other king");
        //             return false;
        //         }
        //     }
        // }
        // 
        //moving in the only places around it  
        if ((col > getColumn() + 1 || col < getColumn() - 1 ) || (row > getRow() + 1 || row < getRow() - 1 )){
            System.out.println("not in box");
            return false;
        }
        

        
        // if (isKingThere(row, col) == true){
        //     return false;
        // }
        
        return true;
    }
    //actually moves the piece
    public void moveTo(int row, int col){
        ChessPiece temp = board [getRow()][getColumn()];
        board [getRow()][getColumn()] = null;
        board [row][col] = temp;
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
    boolean isKingThere(int row, int col){
        if (row -1 >0 && col - 1 > 0){
            System.out.println(board[row -1][col-1].toString());
            if (board[row -1][col-1] instanceof King){
                    System.out.println(board[row -1][col-1].toString());
                System.out.println("true true yayyyy");
                    return true;
            }
        }
        
        else if (row -1 >0 && col + 1 < board[0].length-1 ){
            System.out.println(board[row -1][col-1].toString());
            if (board[row -1][col+1] instanceof King){
                System.out.println(board[row -1][col-1].toString());
                return true;
            }
        }
        else if (row +1 >board.length-1 && col - 1 > 0){
            if (board[row +1][col-1] instanceof King){
                return true;
            }
        }
        else if (row +1 <board.length-1 && col + 1 < board[0].length-1){
            System.out.println(row +"" + col + "");
            System.out.println(board[row +1][col+1]);
            
            // System.out.println("treu true yayyyyy");
            if (board[row +1][col+1] instanceof King){
            System.out.println(board[row +1][col+1].toString());
                
                System.out.println("treu true yayyyyy");
                return true;
            }
        }
        else if (col +1 <board[0].length){
            if (board[row][col +1] instanceof King){
                return true;
            }
        }
        else if (row -1 >0){
            if (board[row -1][col] instanceof King){
                return true;
            }
        }
        if (row +1 < board.length){
            if (board[row +1][col] instanceof King){
                return true;
            }
        }
        else if (col -1 >0){
            if (board[row][col -1] instanceof King){
                return true;
            }
        }
        
        // System.out.println("yeah so the stuff didnt even run");
        System.out.println("false false boooooo");
            return false;
    }
    // ArrayList<ChessPiece> checkCircle(int row, int col){
    //     ArrayList<ChessPiece> pieces = new ArrayList<>();
    //     if (col - 1 >= 0){
    //         for (int i = col - 1; i <= col+1; i++){
    //             if (board [row -1][i]!= null){
    //                 pieces.add(board[row-1][i]);
    //             }
    //         }
    //     }
    //     if (col - 1 >= 0){

    //     }
    //     for (int i = col - 1; i <= col+1; i++){
    //         if (board [row +1][i] != null){
    //             pieces.add(board[row-1][i]);
    //         }
    //     }
    //     if (board [row][col - 1] != null){
    //         pieces.add(board [row][col - 1]);
    //     }
    //     if (board [row][col + 1] != null){
    //         pieces.add(board [row][col + 1]);
    //     }
    //     return pieces;
    // }
}
