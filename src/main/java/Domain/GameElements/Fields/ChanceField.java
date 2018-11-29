package Domain.GameElements.Fields;

import Domain.GameElements.Entities.ChanceCard;
import Domain.GameElements.Entities.ChanceCardStack;
import Domain.GameElements.Entities.Player;
import TechnicalServices.Utility;

import java.awt.*;
import java.security.SecureRandom;

public class ChanceField extends Field {
    private ChanceCardStack chanceCards;

    /**
     * Constructor for ChanceField, gathers name and description to create the field.
     * @param name Name of the field.
     * @param subtext The fields description.
     * @param bgColour Colour of the field
     */
    public ChanceField(String name, String subtext, Color bgColour){
        super(name, subtext, bgColour);
        this.chanceCards = ChanceCardStack.getStackInstance();
    }

    /**
     * Method to return a ChanceCardStack containing the array of Chance cards
     * @return An array of type ChanceCard
     */
    public ChanceCardStack getChanceCardStak() {
        return chanceCards;
    }
    //TODO : Fix the landOnAction for chancecards


    /**
     * Performs an action when a player lands on the field.
     */
    @Override
    public void landOnAction(Player current, Player[] players, Field[] fields) {
        ChanceCard currentCard = chanceCards.getCurrent();
        currentCard.chanceAction(current, fields, players);
        currentCard = chanceCards.next();
    }

    @Override
    public String toString() {
        return chanceCards.getCurrent().toString();
    }
}
