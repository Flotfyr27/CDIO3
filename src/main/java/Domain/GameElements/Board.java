package Domain.GameElements;

import Domain.GameElements.Entities.*;
import Domain.GameElements.Fields.ChanceField;
import Domain.GameElements.Fields.EmptyField;
import Domain.GameElements.Fields.Field;
import Domain.GameElements.Fields.PropertyField;

public class Board {
    private Player[] players;
    private Field[] fields;
    private ChanceField chanceField;


    public Board() {
        players = new Player[2];
        fields = new Field[24];

    }

    public void movePlayer(Player p, int dist){
        int currentPos = p.getPos();
        currentPos = (currentPos + dist)%fields.length;
        p.setPos(currentPos);
    }

    public Player[] getPlayers() {
        return players;
    }

    public Field[] getFields(){
        return fields;
    }

    /**
     * Method generates a bunch of fields in the shape of the provided monopoly game board
     */
    private void setFields(){
        fields[0] = (new EmptyField("Start", "Land on or pass this field and receive cash"));
        fields[1] = (new PropertyField("Vej1", "Dette er en vej", 200, 2000));
        fields[2] = (new PropertyField("Vej2", "Dette er en vej", 150, 1500));
        fields[3] = (new ChanceField("Chance!", "You only get one shot do not miss your chance to blow!",chanceField.getChanceCards()));
        fields[4] = (new PropertyField("Vej3", "Dette er sjovt nok også en vej", 200, 2000));
        fields[5] = (new PropertyField("Vej4", "Bare en vej", 200, 2000));
        fields[6] = (new EmptyField("På besøg i fængsel", "Du er bare på besøg"));
        fields[7] = (new PropertyField("Vej5", "Endnu en vej", 250, 2500));
        fields[8] = (new PropertyField("Vej6", "Endnu en vej", 250, 2500));
        fields[9] = (new ChanceField("Chance!", "This oppertunity only comes once in a life time yo!", chanceField.getChanceCards()));
        fields[10] = (new PropertyField("Vej7", "En vej", 150, 1500));
        fields[11] = (new PropertyField("Vej8", "Vejen", 150, 1500));
        fields[12] = (new EmptyField("Free parking", "Det gratis"));
        fields[13] = (new PropertyField("Vej9", "Endnu en", 100, 1000));
        fields[14] = (new PropertyField("Vej10", "Fin vej", 100, 1000));
        fields[15] = (new ChanceField("Chance!", "A second chance!", chanceField.getChanceCards()));
        fields[16] = (new PropertyField("Vej11", "Lidt bedre end andre gode veje", 300, 3000));
        fields[17] = (new PropertyField("Vej12", "Også en del af klubben", 300, 3000));
        fields[18] = (new EmptyField("Fængsel ;)", "Good shit det ikke er implementeret"));
        fields[19] = (new PropertyField("Vej13", "Se mine dårlige donuts på din villavej", 200, 2000));
        fields[20] = (new PropertyField("Vej14", "Vi har været der!", 200, 2000));
        fields[21] = (new ChanceField("Chance!", "Keep 'em coming", chanceField.getChanceCards()));
        fields[22] = (new PropertyField("Vej15", "En flot vej", 400, 4000));
        fields[23] = (new PropertyField("Vej16", "Den bedste vej", 425, 4250));
    }
}
