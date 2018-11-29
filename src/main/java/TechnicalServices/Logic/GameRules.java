package TechnicalServices.Logic;

import Domain.GameElements.Entities.Player;

import Domain.GameElements.Board;
import Domain.GameElements.Fields.PropertyField;

/**
 * A class checking whether some rule comes into effect. mainly win and lose conditions
 */
public class GameRules {
    /**
     * This method checks if a player has lost or not
     * @param player The player object being examined
     * @return True if the player has lost
     */
    public boolean hasLost(Player player){
        if (player.getAccount().getScore() < 0) {
            return true;
        }else {
            return false;
        }
    }

    public Player getWinner(Board board) throws Exception {
        Player winner = null;
        Player[] pArr = board.getPlayers();
        for (int i = 0; i < pArr.length; i++) {
            if (winner == null)
                winner = pArr[i];
            else if (winner.getAccount().getScore() == pArr[i].getAccount().getScore()) {
                    winner = compareByProperty(board, winner, pArr[i]);
            }
            else if (winner.getAccount().getScore() < pArr[i].getAccount().getScore())
                winner = pArr[i];
        }
        return winner;
    }

    private Player compareByProperty(Board board, Player p1, Player p2) throws Exception {
        int p1Score = 0;
        int p2Score = 0;

        for (PropertyField f : board.getFieldsOfOwner(p1)){
            p1Score += f.getPrice();
        }

        for (PropertyField f : board.getFieldsOfOwner(p2)){
            p2Score += f.getPrice();
        }

        if (p1Score == p2Score)
            throw new Exception("It's a tie between " + p1.getName() + " and " + p2.getName());
        else if (p1Score < p2Score)
            return p2;
        else
            return p1;
    }
}
