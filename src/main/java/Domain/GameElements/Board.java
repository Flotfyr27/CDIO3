package Domain.GameElements;

import Domain.GameElements.Entities.Player;
import Domain.GameElements.Fields.Field;

public class Board {
    private Player[] players;
    private Field[] fields;

    public Board() {
        players = new Player[2];
        fields = new Field[24];
    }

    public void movePlayer(Player p, int dist){
        p.setPos(dist);
    }
}
