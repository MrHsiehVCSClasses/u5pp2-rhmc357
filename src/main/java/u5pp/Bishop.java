package u5pp;

import java.sql.RowIdLifetime;

public class Bishop extends ChessPiece {
    public Bishop(ChessPiece[][] board, int row, int col, boolean isWhite){
        super(board, row, col, isWhite);
    }
    public boolean canMoveTo(int row, int col){
        if (row < 0 || row > 7 || col < 0 || col >7){
            System.out.println(false);
            return false; 
        }
        if (getRow() == row && getColumn() == col){
            System.out.println(false);
            return false;
        }
        // if (getIsWhite() == isWhite){
        //     System.out.println(false);
        //     return false;
        // }
        if (getRow() == row || getColumn() == col){
            System.out.println(false);
            return false;
        }
        if (board[row][col] != null && board[row][col].getIsWhite() != isWhite ){
            System.out.println(false);
            return false;
        }
        int rt = 1;
        int ct = 1;
        if (getRow() > row) {
            rt = -1;
        }
        if (getColumn() > col){
            ct = -1;
        }
        if (getRow() < row && getColumn()<col){
            for (int cr = getRow(); cr < row; cr = cr + rt){
                System.out.println("current row: " + cr + "row tracker: " + rt);
                for (int cc = getColumn(); cc < col; cc = cc + ct){
                    System.out.println("current col: " + cc + "col tracker: " + ct);
                    if (board[cr][cc] != null){
                        System.out.println(false);
                        return false;
                    }
                }
            }
        }
        if (getRow() > row && getColumn()>col){
            for (int cr = getRow(); cr > row; cr = cr + rt){
                System.out.println("current row: " + cr + "row tracker: " + rt);
                for (int cc = getColumn(); cc > col; cc = cc + ct){
                    System.out.println("current col: " + cc + "col tracker: " + ct);
                    if (board[cr][cc] != null){
                        System.out.println(false);
                        return false;
                    }
                }
            }
        }
        if (getRow() > row && getColumn()<col){
            for (int cr = getRow(); cr > row; cr = cr + rt){
                System.out.println("current row: " + cr + "row tracker: " + rt);
                for (int cc = getColumn(); cc < col; cc = cc + ct){
                    System.out.println("current col: " + cc + "col tracker: " + ct);
                    if (board[cr][cc] != null){
                        System.out.println(false);
                        return false;
                    }
                }
            }
        }
        if (getRow() < row && getColumn()>col){
            for (int cr = getRow(); cr < row; cr = cr + rt){
                System.out.println("current row: " + cr + "row tracker: " + rt);
                for (int cc = getColumn(); cc > col; cc = cc + ct){
                    System.out.println("current col: " + cc + "col tracker: " + ct);
                    if (board[cr][cc] != null){
                        System.out.println(false);
                        return false;
                    }
                }
            }
        }
        System.out.println(true);
        return true;
    }
    public String toString() {
        if (isWhite == true){
            return "B";
        }
        else {
            return "b";
        }
    }
}
