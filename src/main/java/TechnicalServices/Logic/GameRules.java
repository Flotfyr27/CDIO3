package TechnicalServices.Logic;

import Domain.GameElements.Entities.Player;

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
}
