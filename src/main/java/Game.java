
import java.util.Scanner;

/**
 * Description: Implement a two-player tic-tac-toe
    game. Display the game board and prompt each
    player to enter their moves. Check for a winning
    condition or a draw after each move, and display
    the result accordingly. Allow the players to play
    multiple rounds if desired.
 */

 // TODO:
 /**
  * Create a runnable Java class called TicTacToe .
    Declare all the required variables.
    Print a rudimentary tic-tac-toe board.
    Obtain user input from the two players.
    Check for a winning play.
    Switch players if the game is not won.
    End the game if all squares are taken.
  */


public class Game {
    public static void main(String[] args){
      String[] players = {"Player_1","Player_2"};
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter number of rows");
      int num_rows = scanner.nextInt();

      char[][]  gameBoard = new char[num_rows][num_rows];

        
      for(int i = 0 ; i < num_rows ; i ++){
        for(int j  = 0 ; j < num_rows; j ++){
              gameBoard[i][j] = ' ';
        }

      }
    printBoard(gameBoard);

    
    }
    public static   void printBoard(char[][] board){
        for(int i = 0 ; i < board.length ; i ++){
            System.out.println(" " + board[i][0] + "|" + board[i][1] + "|" + board[i][2] );
             if(i < 2) System.out.println("----+---+---");
          
        }
   
    }
    static  void chekForWining(){

    }
}