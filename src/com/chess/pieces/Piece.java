package com.chess.pieces;

import com.chess.board.Tile;

public abstract class Piece {

    // Instance Variables
    private boolean removed;
    // White is true & Black is false
    private Color color;

    // Constructor
    public Piece(Color color){
        this.setRemoved(false);
        this.setColor(color);
    }

    // Getters & Setters for removed
    public boolean isRemoved() {
        return removed;
    }

    public void setRemoved(boolean removed) {
        this.removed = removed;
    }

    // Getters & Setters for Color
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    // Check if move is valid
    public abstract boolean isValidMove(Tile start, Tile end);

}

