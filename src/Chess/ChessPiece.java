package Chess;

import BoardGames.piece;

public class ChessPiece extends piece {
private  Color color;


    public ChessPiece(BoardGames.Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }


}
