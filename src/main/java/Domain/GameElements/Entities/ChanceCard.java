package Domain.GameElements.Entities;

import Domain.GameElements.Fields.Field;
import TechnicalServices.ChanceCardAction;

import java.awt.*;

public class ChanceCard {
    //TODO : Fill out the chancecard class

    int actionType;
    int amount;
    Color colour;

    public ChanceCard(ChanceCardAction actionType, int amount){
        this.actionType = actionType.ordinal();
        this.amount = amount;
    }

    public ChanceCard(ChanceCardAction actionType, Color colour){
        this.actionType = actionType.ordinal();
        this.colour = colour;
    }

    public void chanceAction(Player player, Field[] fields){
        switch (actionType) {
            case 0:
                changeBalance(player);
                break;
            case 1:
                moveByAmount(player, fields);
                break;
            case 2:
                moveToColour(player, fields);
                break;
            case 3:
                moveToStart();
                break;
            case 4:
                birthday();
                break;

        }

    }

    private void changeBalance(Player p){
        p.getAccount().changeScore(amount);
    }

    private void moveByAmount(Player p, Field[] fields){
        int currentPos = p.getPos();
        currentPos = (currentPos + amount)%fields.length;
        p.setPos(currentPos);
    }

    private void moveToColour(Player p, Field[] fields){
        int destination = nextFieldOfColour(p, fields);

        if (destination != -1) {
            p.setPos(destination);
        }
    }

    private void moveToStart(Player p){
        p.setPos(0);
    }

    private void birthday(Player player, Player[] players){
        for (Player p : players){
            p.getAccount().changeScore(-amount);
        }

        player.getAccount().changeScore(amount * players.length);
    }

    private int nextFieldOfColour(Player p, Field[] fields){
        for (int i = p.getPos(); i < p.getPos(); i = ++i % fields.length) {
            if (fields[i].getColour() == colour) {
                return i;
            }
        }

        return -1;
    }


}
