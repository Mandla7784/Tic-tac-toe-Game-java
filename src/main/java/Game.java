/**
 * Description: Implement a two-player tic-tac-toe
    game. Display the game board and prompt each
    player to enter their moves. Check for a winning
    condition or a draw after each move, and display
    the result accordingly. Allow the players to play
    multiple rounds if desired.
 */



public class Game {
    public static void main(String[] args){
      String[] players = {"Player_1","Player_2"};
      String[] gameBoard = {"_","|","_","|","_","|","_","|","_","|","_","|"};

        
      for(int i = 0 ; i < gameBoard.length ; i ++){
        for(int j  = 0 ; j < gameBoard.length; j ++){
                System.out.println(gameBoard[i]);
        }
        System.out.println();
      }


    }
}