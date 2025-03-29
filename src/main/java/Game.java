
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
    public static Random number = new Random();
    private  static    String[] players = {"Player_X","Player_O"};
     public static  int  currentPlayerIdx = number.nextInt(2);
     private static  String currentPlayer = players[currentPlayerIdx].split("_")[1];
     public static void main(String[] args){


                  int gameTimer = 10;


                    System.out.println(currentPlayer + "CUU");
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter number of rows");
                    printBoard(promptUser(scanner));
                    System.out.println("THE Current player is " + currentPlayer);
                    System.out.println();

                    System.out.println("Enter your moves symbol: "  + currentPlayer + "   and index");
                    char playerMove =  scanner.next().charAt(0);

                    System.out.println();
                    int row = scanner.nextInt();
                    int col =scanner.nextInt();
                   char [][] theGameBoard = promptUser(scanner);
                   theGameBoard[row][col] = playerMove;
         
      }
      public  char getPlayer(){
          if(this.currentPlayer.equals("X")) return  'O';
          return  'X';


      }
    
        public static   void printBoard(char[][] board){
            setBoard(board);
        }
        public  static  void setBoard(char[][] board){
            for(int i = 0 ; i < board.length ; i ++){
                System.out.println(" " + board[i][0] + "|" + board[i][1] + "|" + board[i][2] );
                if(i < 2) System.out.println("----+---+---");
            }

        }
        public    char  chekForWiningAndTie(char[][] board , char player , char nextPlayer){
            for(int row = 0 ;  row < board.length ; row ++){
                if(board[row][0] == player && board[row][1] == player && board[row][2] == player){
                    System.out.println("The winner is \n " + player);
                
                }else if(board[row][0] == player && board[row][1] == nextPlayer && board[row][2] == player){
                    System.out.println("Its a tie");
                }
            }
            // Cols
            for(int col = 0 ; col < board[0].length ; col ++){
                if(board[0][col] == player && board[1][col] == player && board[2][col] == player){
                System.out.println("The winner is \n " + player);

        
                }else if(board[0][col] == player && board[1][col] == nextPlayer && board[2][col] == player){
                        System.out.println("Its a tie");
                }
            }
            // Diagonals
            if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
                    System.out.println("The winner is \n " + player);    
            
            }else if (board[0][0] == player && board[1][1] == nextPlayer && board[2][2] == player){
                    System.out.println("Its a tie");
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

    }