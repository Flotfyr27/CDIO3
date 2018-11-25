package Domain.GameElements.Fields;

import Domain.GameElements.Entities.Player;

public class PropertyField extends Field {

    private int rent, price;
    private Player owner;

    /**
     * Constructor for PropertyField
     * @param name Name of the field
     * @param description Description of the field
     * @param rent Rent to pay for when another player lands on the field
     * @param price Price to purchase the property
     * @param owner Current owner of the property
     */
    public PropertyField(String name, String description, int rent, int price, Player owner){
        super(name, description);
        this.rent = rent;
        this.price = price;
        this.owner = owner;
    }

    @Override
    public void landOnAction() {
        super.landOnAction();
    }
}
