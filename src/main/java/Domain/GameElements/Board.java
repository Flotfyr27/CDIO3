package Domain.GameElements;

import Domain.GameElements.Entities.*;
import Domain.GameElements.Fields.Field;

public class Board {
    private Player[] players;
    private Field[] fields;
    private Die die;

    public Board() {
        players = new Player[2];
        fields = new Field[24];
        die = new Die();
    }

    public void movePlayer(Player p, int dist){
        p.setPos(dist);
    }
}
