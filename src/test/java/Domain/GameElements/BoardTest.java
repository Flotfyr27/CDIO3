package Domain.GameElements;

import Domain.GameElements.Entities.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void movePlayer() {
        Board board = new Board();
        board.initPlayers(2);
        Player player1 = board.getPlayers()[0];
        Player player2 = board.getPlayers()[1];
        //Save starting positions
        int startPos1 = player1.getPos();
        int startPos2 = player2.getPos();
        //Test for accurate starting location
        assertEquals(0, startPos1);
        assertEquals(0, startPos2);
        //Test movement
        board.movePlayer(player1, 2);
        board.movePlayer(player2, 3);
        assertEquals(2, player1.getPos());
        assertEquals(3, player2.getPos());
        //Moving players to tile before START
        player1.setPos(23);
        player2.setPos(23);
        //Setting balance to pre-defined value
        int player1Bal = player1.getAccount().getScore();
        int player2Bal = player2.getAccount().getScore();
        //Test for balance increase
        board.movePlayer(player1, 1);
        board.movePlayer(player2, 1);
        assertEquals(player1Bal + 2, player1.getAccount().getScore());
        assertEquals(player2Bal + 2, player2.getAccount().getScore());
    }

    @Test
    void initPlayers() {
        Board board = new Board();
        //Test for 2 players
        board.initPlayers(2);
        assertEquals(2, board.getPlayers().length);
        assertEquals(20, board.getPlayers()[0].getAccount().getScore());
        //Test for 3 players
        board.initPlayers(3);
        assertEquals(3, board.getPlayers().length);
        assertEquals(18, board.getPlayers()[0].getAccount().getScore());
        //Test for 4 players
        board.initPlayers(4);
        assertEquals(4, board.getPlayers().length);
        assertEquals(16, board.getPlayers()[0].getAccount().getScore());
    }
}