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

    /**
     * Method returns the rent of the property.
     * @return The rent is returned.
     */
    public int getRent(){
        return rent;
    }

    /**
     * Method returns the price of the property.
     * @return Integer representing the property price.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Method returns the current owner.
     * @return Object of type player.
     */
    public Player getOwner() {
        return owner;
    }
//TODO : Change for purpose of buying the property or paying rent
    @Override
    public void landOnAction() {
        super.landOnAction();
    }
}
