package Domain.GameElements.Fields;

public class EmptyField extends Field {
    /**
     * EmptyField is a subclass of field meant to fill the role of START, prison and other misc fields.
     * @param name Name of the field.
     * @param description The fields description.
     */
    public EmptyField(String name, String description){
        super(name, description);
    }

    @Override
    public void landOnAction() {
        super.landOnAction();
    }
}
