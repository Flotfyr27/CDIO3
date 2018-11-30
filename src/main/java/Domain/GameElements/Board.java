package Domain.GameElements;

import Domain.GameElements.Entities.Player;
import Domain.GameElements.Fields.ChanceField;
import Domain.GameElements.Fields.EmptyField;
import Domain.GameElements.Fields.Field;
import Domain.GameElements.Fields.PropertyField;

import java.awt.*;
import java.util.Arrays;

public class Board {
    private Player[] players;
    private Field[] fields;
    private final Color BROWN = new Color(102,51,0);
    private final Color HOT_PINK = new Color(255, 105, 180);
    private final Color FOREST_GREEN = new Color(20, 126, 18);


    public Board() {
        setFields();
    }

    public void movePlayer(Player p, int dist){
        int currentPos = p.getPos();
        if((currentPos + dist) >= fields.length){
            p.getAccount().changeScore(2);
        }
        currentPos = (currentPos + dist)%fields.length;
        p.setPos(currentPos);
    }

    public Player[] getPlayers() {
        return players;
    }

    public Field[] getFields(){
        return fields;
    }

    public void initPlayers(int numberOfPlayers){
        players = new Player[numberOfPlayers];
        int startingCapital;
        if(numberOfPlayers == 2){
            startingCapital = 20;
        }else if(numberOfPlayers == 3){
            startingCapital = 18;
        }else if(numberOfPlayers == 4){
            startingCapital = 16;
        }else{
            startingCapital = 16;
        }
        for(int i = 0; i < numberOfPlayers; i++){
            players[i] = new Player("Player" + (i+1));
            players[i].getAccount().changeScore(startingCapital);
        }
    }

    /**
     * Method generates a bunch of fields in the shape of the provided monopoly game board
     */
    private void setFields(){
        fields = new Field[24];
        fields[0] = (new EmptyField("START", "Modtag $2, når du passerer", Color.lightGray));
        fields[1] = (new PropertyField("BURGERBAREN", "$1", BROWN, 1, 2));
        fields[2] = (new PropertyField("PIZZARIAET", "$1", BROWN, 1, 1));
        fields[3] = (new ChanceField("?", "",Color.lightGray));
        fields[4] = (new PropertyField("SLIKBUTIKKEN", "$1", Color.cyan, 1, 5));
        fields[5] = (new PropertyField("ISKIOSKEN", "$1", Color.cyan, 1, 4));
        fields[6] = (new EmptyField("PÅ BESØG", "", Color.lightGray));
        fields[7] = (new PropertyField("MUSEET", "$2", Color.magenta, 2, 8));
        fields[8] = (new PropertyField("BIBLIOTEKET", "$2", Color.magenta, 2, 7));
        fields[9] = (new ChanceField("?", "", Color.lightGray));
        fields[10] = (new PropertyField("SKATERPARKEN", "$2", Color.pink, 2, 11));
        fields[11] = (new PropertyField("SWIMMINGPOOLEN", "$2", Color.pink, 2, 10));
        fields[12] = (new EmptyField("GRATIS PARKERING", "", Color.lightGray));
        fields[13] = (new PropertyField("SPILLEHALLEN", "$3", Color.RED, 3, 14));
        fields[14] = (new PropertyField("BIOGRAFEN", "$3", Color.RED, 3, 13));
        fields[15] = (new ChanceField("?", "", Color.lightGray));
        fields[16] = (new PropertyField("LEGETØJSBUTIKKEN", "$3", Color.YELLOW, 3, 17));
        fields[17] = (new PropertyField("DYREHANDLEN", "$3", Color.YELLOW, 3, 16));
        fields[18] = (new EmptyField("GÅ I FÆNGSEL", "", Color.lightGray));
        fields[19] = (new PropertyField("BOWLINGHALLEN", "$4", FOREST_GREEN, 4, 20));
        fields[20] = (new PropertyField("ZOO", "$4", FOREST_GREEN, 4, 19));
        fields[21] = (new ChanceField("?", "", Color.lightGray));
        fields[22] = (new PropertyField("VANDLANDET", "$5", Color.BLUE, 5, 23));
        fields[23] = (new PropertyField("STRANDPROMENADEN", "$5", Color.BLUE, 5, 22));
    }

    /**
     * Method updates the rent to twice the value if a field and its corresponding sisterfield is owned by the same player
     */
    public void UpdateRent(){
        for(int i = 0; i < getFields().length; i++){
            if(getFields()[i].getClass().equals(PropertyField.class)){
                PropertyField sisterField = ((PropertyField) getFields()[((PropertyField) getFields()[i]).getSisterField()]);
                PropertyField ogField = ((PropertyField) getFields()[i]);
                if(!ogField.getIsPaired()) {
                    if (ogField.getOwner() == sisterField.getOwner() && (ogField.getOwner() != null) && (sisterField.getOwner() != null)) {
                        ogField.setRent(ogField.getPrice() * 2);
                        sisterField.setRent(sisterField.getPrice() * 2);
                        ogField.setPaired(true);
                        sisterField.setPaired(true);
                    }
                }
            }
        }
    }

    public PropertyField[] getFieldsOfOwner(Player owner){
        int i = 0;
        PropertyField[] colouredFields = new PropertyField[fields.length];
        for (Field f : fields) {
            if (f.getClass().equals(PropertyField.class)){
                if (((PropertyField) f).getOwner() == owner){
                    colouredFields[i++] = (PropertyField) f;
                }
            }
        }
        return colouredFields;
    }

}
