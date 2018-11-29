package Domain.GameElements.Fields;

import Domain.GameElements.Entities.Player;

import java.awt.*;

public class PropertyField extends Field {

    private int price;
    private Player owner;

    /**
     * Constructor for PropertyField
     * @param name Name of the field
     * @param subtext Description of the field
     * @param price Price to purchase the property
     * @param bgColour Colour of the field.
     */
    public PropertyField(String name, String subtext, Color bgColour, int price){
        super(name, subtext, bgColour);
        this.price = price;
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
    public void landOnAction(Player current, Player[] players, Field[] fields) {

        if (owner == null) {
            current.getAccount().changeScore(-price);
            owner = current;

        } else {
            current.getAccount().changeScore(-price);
            owner.getAccount().changeScore(price);
        }
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(getName() + "\n");

        if (owner != null)
            builder.append("Owner: " + owner.getName() + "\n");
        else
            builder.append("Owner: none\n");

        builder.append("Rent: " + price);
        return builder.toString();
    }
}
