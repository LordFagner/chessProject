package BoardGames;

public class Board  {
    private int columns;
    private  int row;
    private piece[][] pieces;

    public Board(int columns, int row) {
        this.columns = columns;
        this.row = row;
        pieces = new piece[row][columns];
    }


    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
