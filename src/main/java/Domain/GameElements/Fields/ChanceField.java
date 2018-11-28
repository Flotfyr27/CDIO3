package Domain.GameElements.Fields;

import Domain.GameElements.Entities.ChanceCard;
import Domain.GameElements.Entities.Player;
import TechnicalServices.Utility;

import java.awt.*;
import java.security.SecureRandom;

public class ChanceField extends Field {
    private ChanceCard[] chanceCards;
    private SecureRandom random = new SecureRandom();

    /**
     * Constructor for ChanceField, gathers name, description and chancecards to create the field.
     * @param name Name of the field.
     * @param subtext The fields description.
     * @param chanceCards An array of chance cards supplied by the ChanceCard class.
     * @param bgColour Colour of the field
     */
    public ChanceField(String name, String subtext, Color bgColour, ChanceCard[] chanceCards){
        super(name, subtext, bgColour);
        this.chanceCards = chanceCards;
    }

    /**
     * Method to return an array of Chance cards
     * @return An array of type ChanceCard
     */
    public ChanceCard[] getChanceCards() {
        return chanceCards;
    }
    //TODO : Fix the landOnAction for chancecards
    /**
     * Performs an action when a player lands on the field.
     */
    /*@Override
    public void landOnAction(Player current, Player[] players, Field[] fields) {
        Utility.shuffleCards(chanceCards);
        chanceCards[random.nextInt(chanceCards.length)].chanceAction(current, fields, players);
    }*/
}
