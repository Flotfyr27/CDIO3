package Domain.GameElements.Fields;

public class EmptyField extends Field {

    public EmptyField(String name, String description){
        super(name, description);
    }

    @Override
    public void landOnAction() {
        super.landOnAction();
    }
}
