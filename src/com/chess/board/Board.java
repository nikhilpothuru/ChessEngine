package com.chess.board;

import com.chess.pieces.Piece;
import com.chess.pieces.PieceFactory;

import java.util.Arrays;

public class Board {
    private final int X = 8;
    private final int Y = 8;
    private final Tile[][] board;
    private static final Board gameboard = new Board();

    private Board() {
        this.board = new Tile[Y][X];
        this.setBoard();
    }

    public static Board getInstance(){
        return gameboard;
    }

    public Tile[][] getBoard() {
        return this.board;
    }

    public void setBoard() {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                Piece piece = PieceFactory.getPiece(i, j);
                board[i][j] = new Tile(i, j, piece);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        for(int i = board.length-1; i >= 0; i--) {
            int rowIndicator = i+1;
            temp.append("   " + rowIndicator + "  ");
            for(int j = 0; j < board[0].length; j++) {
                temp.append(board[i][j].toString());
            }
            temp.append("\n");
        }
        temp.append("      ");
        for(int i = 0; i < board[0].length; i++) {
            char colIndicator = (char)(i+65);
            temp.append("   " + colIndicator + "  ");
        }
        return temp.toString();
    }
}
