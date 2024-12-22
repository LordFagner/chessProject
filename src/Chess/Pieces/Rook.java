package Chess.Pieces;

import BoardGames.Board;
import Chess.ChessPiece;
import Chess.Color;

public class Rook extends ChessPiece {

    public Rook(BoardGames.Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return  "R";
    }
}
