package com.chess.pieces;

import com.chess.board.Tile;

public class Rook extends Piece {

    public Rook(Color color) {
        super(color);
    }

    @Override
    public boolean isValidMove(Tile start, Tile end) {
        return false;
    }
}
