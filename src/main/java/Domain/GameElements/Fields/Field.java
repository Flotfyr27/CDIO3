package Domain.GameElements.Fields;

public abstract class Field {
     private String name, description;

     public Field(String name, String description){
         this.name = name;
         this.description = description;
     }

     public String getName(){
         return name;
     }
     public String getDescription(){
         return description;
     }
     public void landOnAction(){}
}
