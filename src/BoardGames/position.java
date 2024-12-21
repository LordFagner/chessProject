package BoardGames;

public class position {
private int Row;
private int line;

    public position() {
    }

    public position(int row, int line) {
        Row = row;
        this.line = line;
    }

    public int getRow() {
        return Row;
    }

    public void setRow(int row) {
        Row = row;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }



    public  void values( int row , int line){
    this.line = line;
    this.Row = row;



    }

    @Override
    public String toString() {
        return "line : " + getLine() + " row : " +getRow();
    }
}
