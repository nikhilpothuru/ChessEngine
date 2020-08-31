package com.chess.pieces;

public class PieceFactory {
    public static Piece getPiece(int row, int col) {
        switch(row) {
            case 0:
            case 7:
                Color color = (row == 0) ? Color.WHITE : Color.BLACK;
                switch(col) {
                    // Return Rook
                    case 0:
                    case 7:
                        return new Rook(color);
                    // Return Knight
                    case 1:
                    case 6:
                        return new Rook(color);
                    // Return Bishop
                    case 2:
                    case 5:
                        return new Rook(color);
                    // Return Queen
                    case 3:
                        return new Rook(color);
                    // Return King
                    case 4:
                        return new Rook(color);
                    default:
                        return null;
                }
            case 1:
            case 6:
                // Return Pawns
                Color color1 = (row == 1) ? Color.WHITE : Color.BLACK;
                return new Rook(color1);
            default:
                return null;
        }
    }
}
