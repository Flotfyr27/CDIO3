import Domain.GameElements.Board;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void movePlayer() {
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