package Domain.GameElements.Fields;

import Domain.GameElements.Entities.Player;

import java.awt.*;

public class EmptyField extends Field {
    /**
     * EmptyField is a subclass of field meant to fill the role of START, prison and other misc fields.
     * @param name Name of the field.
     * @param subtext The fields description.
     * @param bgColour The colour of the field.
     */
    public EmptyField(String name, String subtext, Color bgColour){
        super(name, subtext, bgColour);
    }

    public void landOnAction(Player current, Player[] players, Field[] fields) {

    }

    public String getMessage(Player current) {
        return "This field does nothing";
    }
}
