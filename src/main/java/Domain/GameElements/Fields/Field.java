package Domain.GameElements.Fields;

import Domain.GameElements.Entities.Player;

import java.awt.*;

public abstract class Field {
     private String name, subtext;
     private Color bgColour;

     public Field(String name, String subtext, Color bgColour){
         this.name = name;
         this.subtext = subtext;
         this.bgColour = bgColour;
     }

     public String getName(){
         return name;
     }
     public String getSubtext(){
         return subtext;
     }
     public Color getBgColour(){ return bgColour;}
     public abstract String landOnAction(Player current, Player[] players, Field[] fields);
}
