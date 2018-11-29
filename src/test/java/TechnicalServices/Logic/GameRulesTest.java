package TechnicalServices.Logic;

import Domain.GameElements.Board;
import Domain.GameElements.Entities.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameRulesTest {

    @Test
    void getWinner() throws Exception {
        Board b = new Board();
        b.initPlayers(2);
        GameRules GR = new GameRules();
        Player p1 = b.getPlayers()[0];
        Player p2 = b.getPlayers()[1];
        //Adds a lot of money to player1
        p1.getAccount().changeScore(100);
        //Test for winner = player1
        assertEquals(p1, GR.getWinner(b));
    }
}