package Application;

import Chess.ChessPiece;

public class UI {

    public static void PrintBoard(ChessPiece[][] pieces){
        for (int i = 0; i < pieces.length; i++) {
            System.out.print((8-i) + " ");
            for (int j = 0; j < pieces.length ; j++) {
            PrintPiece(pieces[i][j]);
            }
            System.out.println();
        }
    System.out.println("  A B C D E F G H");    

    }

    private static  void PrintPiece(ChessPiece pieces){
    if (pieces == null){
    System.out.print("-");
    }else {
        System.out.print(pieces);
    }
        System.out.print(" ");




    }


}
