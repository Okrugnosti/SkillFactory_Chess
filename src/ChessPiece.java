//абстрактный класс "шахматная фигура"

public abstract class ChessPiece {

    String color;
    boolean check = true;

    public ChessPiece(String color) {
        this.color = color;
    }

    public abstract String getColor();

    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);

    //возвращающий — тип фигуры
    public abstract String getSymbol();

    public abstract boolean checkPos(int pos);

}
