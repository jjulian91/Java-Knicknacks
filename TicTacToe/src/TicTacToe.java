
public class TicTacToe {


    public static void main(String[] args) {
        GameBoard Board = new GameBoard();
        boolean keepplaying = true;
        String winner="";
        Board.showBoard();
        //Setting the outer loop to run until a winner is established
        do {
            //inner player loop to ensure their turn ends with valid move
            Board.makeAMove('X');
            Board.showBoard();
            if (Board.isWon('X')){
                keepplaying=false;
                winner = "Player One is the winner!";}
                //only needed one else if because a draw would always end with player 1.
            else if(Board.isDraw()){
                winner = "It's a draw. Please play again";
                keepplaying=false;}
            if (keepplaying) {
                Board.makeAMove('O');
                Board.showBoard();
                if (Board.isWon('O')){
                    keepplaying=false;
                    winner = "Player Two is the winner!";}
            }
            } while (keepplaying);
//displays winner after loop exits.
        System.out.println(winner);
    }
}
