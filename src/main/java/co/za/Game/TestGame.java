package  co.za.Game;

import org.junit.Test;
//import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestGame  {
    private static    Game game = new Game();
    public static char nextPlayer;
    public    char player = game.getPlayer();


    @Test
    public  void testHorizontalWinningX(){
        char[][] board = {
                {'X','X','X'},
                {'O',' ','O'},
                {' ','O',' '}
        };
        game.setBoard(board);


        if(game.getPlayer() == 'X'){
            nextPlayer = 'O';

        }else{
            nextPlayer = 'X';

        }
        char winner = game.chekForWiningAndTie(board , player ,nextPlayer);
        assertEquals('X', winner);


    }
    @Test
    public  void testHorizontalWinningO(){
        char[][] board = {
                {'X','X','X'},
                {'O',' ','O'},
                {' ','O',' '}
        };
        game.setBoard(board);


        if(game.getPlayer() == 'X'){
            nextPlayer = 'O';

        }else{
            nextPlayer = 'X';
        }
        char winner = game.chekForWiningAndTie(board , player ,nextPlayer);
        assertEquals('O', winner);

    }

    @Test
    public  void testDiagonalX(){
        char[][] board = {

                {'X','O','X'},
                {'O','X','O'},
                {'X','O','X'}
        };
        game.setBoard(board);

        if(game.getPlayer() == 'X'){
            nextPlayer = 'O';

        }else{
            nextPlayer = 'X';

        }
        char winner = game.chekForWiningAndTie(board , player , nextPlayer);
        assertEquals('X',winner);


    }
    @Test
    public  void testDiagonalO(){
          char [][] board = {
                  {'O','X','O'},
                  {'X','O','X'},
                  {'O','O','O'}
          };
    }
}