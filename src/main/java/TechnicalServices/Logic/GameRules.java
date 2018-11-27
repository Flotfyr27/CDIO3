package TechnicalServices.Logic;

import Domain.GameElements.Entities.Player;

/**
 * A class checking whether some rule comes into effect. mainly win and loose conditions
 */
public class GameRules {
    private Player[] players;

    /**
     * Constructor for GameRules
     * @param players
     */
    public GameRules(Player[] players){
        this.players = players;
    }

    /**
     * This method checks if the player has lost or not
     * @param player
     * @return True if the player has lost
     */
    public boolean hasLost(Player player){
        if (player.getAccount().getScore() < 0)
            return true;
        return false;
    }
}
