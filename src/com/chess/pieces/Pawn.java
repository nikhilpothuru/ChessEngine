package com.chess.pieces;

import com.chess.board.Tile;
import java.lang.Math;

public class Pawn extends Piece{
    public Pawn(Color color) {
        super(color);
    }

    @Override
    public boolean isValidMove(Tile start, Tile end) {
        return canMoveOne(start, end) || canMoveTwo(start, end);
    }

    /* If a pawn can move 2 squares vertically */
    private boolean canMoveTwo(Tile start, Tile end) {
        return ((getColor() == Color.WHITE && start.getX() == 6 && end.getX() == 4) ||
                (getColor() == Color.BLACK && start.getX() == 1 && end.getX() == 3)) &&
                end.toString().equals(".");
    }

    /* If a pawn can move 1 square (capture or not) */
    private boolean canMoveOne(Tile start, Tile end) {
        return ((getColor() == Color.WHITE && end.getX() == start.getX() - 1) ||
                (getColor() == Color.BLACK && end.getX() == start.getX() + 1)) &&
                (start.getY() == end.getY() && end.toString().equals(".") || canCapture(start, end));
    }

    /* If a pawn can capture an enemy piece */
    private boolean canCapture(Tile start, Tile end) {
        return ((getColor() == Color.WHITE && end.toString().startsWith("B")) ||
                (getColor() == Color.BLACK && end.toString().startsWith("W"))) &&
                Math.abs(end.getY() - start.getY()) == 1;
    }
}
