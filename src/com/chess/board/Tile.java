package com.chess.board;

import com.chess.pieces.Piece;

public class Tile {
    private int x;
    private int y;
    private Piece piece;

    public Tile(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Tile(int x, int y, Piece piece) {
        this(x, y);
        this.piece = piece;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Piece getPiece() {
        return piece;
    }

    @Override
    public String toString() {
        return piece != null ? piece.toString() : ".";
    }
}
