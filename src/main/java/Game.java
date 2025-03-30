
import java.util.Random;
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
    private static  final  int BOARD_SIZE= 3;
    private  static  final  char EMPTY_CELL = ' ';

    private static Random number = new Random();
    private  static  String[] players = {"Player_X","Player_O"};
     private static  int  currentPlayerIdx = number.nextInt(2);
     private static  String currentPlayer = players[currentPlayerIdx].split("_")[1];

     // main void
     public static void main(String[] args){
         // Start the game
         initState();

      }
      public  char getPlayer(){
          if(this.currentPlayer.equals("X")) return  'O';
          return  'X';
      }
    
        public static   void printBoard(char[][] board){
            setBoard(board);
        }
        public    static  void setBoard(char[][] board){

         // check for rows
         for(int row = 0 ; row < board.length ; row ++){
                System.out.println(" " + board[row][0] + "|" + board[row][1] + "|" + board[row][2] );
                if(row < 2) System.out.println("----+---+---");
            }

        }
        public  static   char  chekForWiningAndTie(char[][] board , char player , char nextPlayer){
            for(int row = 0 ;  row < board.length ; row ++){
                if(board[row][0] == player && board[row][1] == player && board[row][2] == player){
                    System.out.println("The winner is \n " + player);
                
                }else if(board[row][0] == player && board[row][1] == nextPlayer && board[row][2] == player){
                    System.out.println("Its a tie");
                }
            }
            // Cols
            char colWinner =  checkCols(board , player , nextPlayer);
           if(colWinner != ' '){
               return  colWinner;
           }

            // Diagonals
            char diagonalWinner = checkDiagonal(board , player , nextPlayer);
           if(diagonalWinner != ' '){
               return  diagonalWinner;

           }

            return  player;


        }
        static  char[][] promptUser(Scanner scanner){
        int num_rows = scanner.nextInt();
        char[][]  gameBoard = new char[num_rows][num_rows];
        for(int i = 0 ; i < num_rows ; i ++){
            for(int j  = 0 ; j < num_rows; j ++){
                gameBoard[i][j] = ' ';
            }
        }
        return gameBoard;

        }

      public  static char   checkDiagonal(char [][] board , char player ,char nextPlayer){
         // bottom right diagonal
          if(board[0][0] != ' ' && board[0][0] ==  board[1][1] && board[2][2] == player) {
              System.out.println("The winner is \n " + player);
              return  player;


          }
          //  top-right to bottom-left diagonal
          if(board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]){
              System.out.println("The winner is"+ player);
              return  player;


          }
          return  ' ';
      }
      public  static  char  checkCols(char [][] board , char player ,char nextPlayer){
          for(int col = 0 ; col < board[0].length ; col ++){
              if(board[0][col] == player && board[1][col] == player && board[2][col] == player){
                  System.out.println("The winner is \n " + player);
                  return  player;





              }else if(board[0][col] == player && board[1][col] == nextPlayer && board[2][col] == player){
                  System.out.println("Its a tie");
                  return  player;
              }
          }
          return  ' ';


      }
      public static    void initState(){
          Scanner scanner = new Scanner(System.in);
          int numberOfRows = scanner.nextInt();
          char [][] theGameBoard = new char[numberOfRows][numberOfRows];


        boolean isGameOver = false;
        int moves = 0;

           while (isGameOver){
               System.out.println("The Current Player is" + currentPlayer);
               System.out.println("Enter your moves symbol: "  + currentPlayer + "   and index");
               char playerMove =  scanner.next().charAt(0);
               int row = scanner.nextInt();
               int col = scanner.nextInt();


               if(row < 0 || row >= numberOfRows || col < 0 || col >= numberOfRows ||theGameBoard[row][col] != ' ' ){
                   System.out.println("Invalid move Try again....!");
                   continue;
               }
               theGameBoard[row][col] = playerMove;
               printBoard(promptUser(scanner));
               moves ++;

               char winner = chekForWiningAndTie(theGameBoard , playerMove , (playerMove  == 'X' ? 'O':'X') );
                if(winner != ' '){
                    isGameOver = true;

                    System.out.println("The winner is" + winner);
                }else  if(moves == numberOfRows * numberOfRows){
                    isGameOver = true;

                    System.out.println("Its a tie");
                }


           }




      }
    }