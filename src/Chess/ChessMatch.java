package Chess;

import BoardGames.Board;
import BoardGames.piece;
import BoardGames.position;
import Chess.Pieces.King;
import Chess.Pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        InitilaSetup();

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
private void InitilaSetup(){
        board.placePiece(new Rook(board, Color.White), new position(2,1));
    board.placePiece(new King(board, Color.White), new position(0,3));
    board.placePiece(new King(board, Color.White), new position(7,3));

}

}
