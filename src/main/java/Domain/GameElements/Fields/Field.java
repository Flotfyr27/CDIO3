package Domain.GameElements.Fields;

import java.awt.*;

public abstract class Field {
     private String name, description;
     private Color bgColour;

     public Field(String name, String subtext, Color bgColour){
         this.name = name;
         this.description = subtext;
         this.bgColour = bgColour;
     }

     public String getName(){
         return name;
     }
     public String getDescription(){
         return description;
     }
     public Color getBgColour(){ return bgColour;}
     public void landOnAction(){}
}
