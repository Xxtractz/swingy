package swingy.model;

import org.jetbrains.annotations.Contract;

import javax.validation.constraints.Min;

public class Map {
    private int size;
    private String [][] board;

    @Contract(pure = true)
    public Map(){
    }

    public void printBoard(){
        for(int row = 0;row  < size; row++){
            int column;
            for (column = 0; column < size ; column++) {
                if (board[row][column] == null) {
                    System.out.print("| . ");
                }
                else {
                    System.out.print("| "+ board[row][column]  + " ");
                }
            }
            if (column == size) {
                System.out.print("|");
            }
            System.out.print("\n");
        }
    }

    public String getBoard(){
        StringBuilder _board;

        _board = new StringBuilder();
        for(int row = 0;row  < size; row++){
            int column;
            for (column = 0; column < size ; column++) {
                if (board[row][column] == null) {
                    _board.append("| . ");
                }
                else {
                    _board.append("| ").append(board[row][column]).append(" ");
                }
            }
            if (column == size) {
                _board.append("|");
            }
            _board.append("\n");
        }
        return _board.toString();
    }


    @Min(1)
    public void setSize(int level) {
        this.size = (int) ((level -1) * 5 + 10 - (level*0.02));
    }

    public int getSize() {
        return size;
    }

    public void updatePosition(int x, int y, String c){
        if (x < size && y < size){
            this.board[x][y] = c;
        }
    }

    public void setBoard() {
        this.board = new String[size][size];
        for(int row = 0;row  < size; row++) {
            for (int column = 0; column < size; column++) {
                board[row][column] = null;
            }
        }
    }
}
