import java.util.Scanner;

public class GameBoard {
   private static Scanner input = new Scanner(System.in);
   private static String Turn;

   private final int length= 3;
   private int Row = length, Column = length;
   private char [][] table = new char[length][length];
   boolean result = false;

    public GameBoard (){
        table = setBoard();
    }

    public boolean isWon(char winner){

        if(             (table[0][0]==winner && table[0][1]==winner && table[0][2]==winner) || // 1'st line X
                        (table[1][0]==winner && table[1][1]==winner && table[1][2]==winner) || // 2'nd line X
                        (table[2][0]==winner && table[2][1]==winner && table[2][2]==winner) || // 3'rd line X
                        (table[0][0]==winner && table[1][0]==winner && table[2][0]==winner) || // 1'st row X
                        (table[0][1]==winner && table[1][1]==winner && table[2][1]==winner) || // 2'nd row X
                        (table[0][2]==winner && table[1][2]==winner && table[2][2]==winner) || // 3'rd row X
                        (table[0][0]==winner && table[1][1]==winner && table[2][2]==winner) || // 1'st diag X
                        (table[0][2]==winner && table[1][1]==winner && table[2][0]==winner) ) // 2'nd diag X
                    result = true;
                return result;
    }

    public boolean isDraw(){

        if (    (table[0][0]!='-' && table[0][1]!='-' && table[0][2]!='-') && // 1'st line X
                (table[1][0]!='-' && table[1][1]!='-' && table[1][2]!='-') && // 2'nd line X
                (table[2][0]!='-' && table[2][1]!='-' && table[2][2]!='-')) // 3'rd line X
            result = true;
return result;
    }
    private char[][] setBoard(int a, int b, char Str){
        table[a-1][b-1]=Str;
        return table;
    }
    private char [][] setBoard (){
        char [][] table = {{'-','-','-'},
                {'-','-','-'},
                {'-','-','-'}};
        return table;
    }

    public void makeAMove(char Move){
        String turn;
        if(Move =='X') {
            System.out.println("\t\t\t\t\tTurn == Player One");
            turn = "Player One";}
        else
            {System.out.println("\t\t\t\t\tTurn == Player Two");
            turn = "Player Two";}

        do {
            do{
            System.out.println(turn+" please enter a row:");
            Row = input.nextInt();}
            while (Row >3);
            do{System.out.println(turn+" please enter a Column:");
            {Column = input.nextInt();}}
            while (Column>3);}
         while (checkBoard(Row, Column));
        setBoard(Row, Column, Move);}

    private boolean checkBoard (int a, int b){
        boolean check = false;
        if (table[a-1][b-1]=='O' || table[a-1][b-1]=='X'){
            System.out.println("Please enter another Selection \nthat space is occupied.");
            check = true;
        }
        return check;
    }
    public void showBoard(){
        System.out.println("---------------");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++)
                System.out.print("| "+table[i][j]+" |");
            System.out.println("\n---------------");
        }
    }

}
