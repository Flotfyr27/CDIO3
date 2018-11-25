package Domain.GameElements.Fields;

import Domain.GameElements.Entities.ChanceCard;

public class ChanceField extends Field {
    private ChanceCard[] chanceCards;
    public ChanceField(String name, String description, ChanceCard[] chanceCards){
        super(name, description);
        this.chanceCards = chanceCards;
    }
}
