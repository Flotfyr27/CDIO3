package Domain.GameElements.Fields;

import java.awt.*;

public abstract class Field {
     private String name, description;
     private Color bgColor

     public Field(String name, String description, Color bgColor){
         this.name = name;
         this.description = description;
         this.bgColor = bgColor;
     }

     public String getName(){
         return name;
     }
     public String getDescription(){
         return description;
     }
     public Color getBgColor(){ return bgColor;}
     public void landOnAction(){}
}
