package Domain.GameElements;

import Domain.GameElements.Entities.*;
import Domain.GameElements.Fields.Field;

public class Board {
    private Player[] players;
    private Field[] fields;


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
}
