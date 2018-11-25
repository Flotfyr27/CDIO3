package Domain.GameElements.Fields;

import Domain.GameElements.Entities.ChanceCard;

public class ChanceField extends Field {
    private ChanceCard[] chanceCards;

    /**
     * Constructor for ChanceField, gathers name, description and chancecards to create the field.
     * @param name Name of the field.
     * @param description The fields description.
     * @param chanceCards An array of chance cards supplied by the ChanceCard class.
     */
    public ChanceField(String name, String description, ChanceCard[] chanceCards){
        super(name, description);
        this.chanceCards = chanceCards;
    }

    /**
     * Method to return an array of Chance cards
     * @return An array of type ChanceCard
     */
    public ChanceCard[] getChanceCards() {
        return chanceCards;
    }
    //TODO : Change landOnAction to fit chancecards appropriately
    /**
     * Performs an action when a player lands on the field.
     */
    @Override
    public void landOnAction() {
        super.landOnAction();
    }
}
