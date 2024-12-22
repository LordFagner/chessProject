package Chess.Pieces;

import BoardGames.Board;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.Color;

public class King extends ChessPiece {

    public King(BoardGames.Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return  "K";
    }
}
