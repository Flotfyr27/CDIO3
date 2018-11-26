package Domain.GameElements.Fields;

import java.awt.*;

public class EmptyField extends Field {
    /**
     * EmptyField is a subclass of field meant to fill the role of START, prison and other misc fields.
     * @param name Name of the field.
     * @param description The fields description.
     * @param bgColour The colour of the field.
     */
    public EmptyField(String name, String description, Color bgColour){
        super(name, description, bgColour);
    }

    @Override
    public void landOnAction() {
        super.landOnAction();
    }
}
