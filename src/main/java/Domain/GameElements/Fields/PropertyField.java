package Domain.GameElements.Fields;

import Domain.GameElements.Entities.Player;

import java.awt.*;

public class PropertyField extends Field {

    private int rent, price;
    private Player owner;

    /**
     * Constructor for PropertyField
     * @param name Name of the field
     * @param description Description of the field
     * @param rent Rent to pay for when another player lands on the field
     * @param price Price to purchase the property
     * @param bgColour Colour of the field.
     */
    public PropertyField(String name, String description, Color bgColour, int rent, int price){
        super(name, description, bgColour);
        this.rent = rent;
        this.price = price;
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
     * Sets the owner of the field
     * @param owner Is the player object which owns the field
     */
    public void setOwner(Player owner) {
        this.owner = owner;
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
