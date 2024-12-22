package Chess;

import BoardGames.Board;
import BoardGames.piece;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
    }


    public ChessPiece[][] GetPieces() {
        ChessPiece[][] pieces = new ChessPiece[board.getRow()][board.getColumns()];
        for (int i = 0; i < board.getRow(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                pieces[i][j] = (ChessPiece) board.Piece(i, j);
            }
        }
        return pieces;
    }


}
