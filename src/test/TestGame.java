
import org.junit.Test;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class TestGame  {
    private  Game game = new Game();
    public static char nextPlayer;


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
        assertEquals('X', game.chekForWiningAndTie(board , game.getPlayer() , ''));


    }
    public  void testHorizontalWinningO(){
        char[][] board = {
                {'X','X','X'},
                {'O',' ','O'},
                {' ','O',' '}
        };
        game.setBoard(board);
        assertEquals('O',game.chekForWiningAndTie(board,););

    }
}