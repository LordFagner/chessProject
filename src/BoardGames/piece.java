package BoardGames;


public class piece {

protected position position;
private  Board Board;

    public piece(BoardGames.Board board) {
        Board = board;
    }

    protected Board getBoard() {
        return Board;
    }




}
