package Domain.GameElements.Fields;

import Domain.GameElements.Entities.Player;

public class PropertyField extends Field {

    private int rent, price;
    private Player owner;
    public PropertyField(String name, String description, int rent, int price, Player owner){
        super(name, description);
        this.rent = rent;
        this.price = price;
        this.owner = owner;
    }
}
