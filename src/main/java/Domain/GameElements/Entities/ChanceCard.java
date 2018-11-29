package Domain.GameElements.Entities;

import Domain.GameElements.Fields.Field;
import TechnicalServices.ChanceCardAction;

import java.awt.*;

public class ChanceCard {

    private int actionType;
    private int amount;
    private Color colour;



    public ChanceCard(ChanceCardAction actionType, int amount){
        this.actionType = actionType.ordinal();
        this.amount = amount;
    }

    public ChanceCard(ChanceCardAction actionType, Color colour){
        this.actionType = actionType.ordinal();
        this.colour = colour;
    }

//TODO : Add a text based description or an array with descriptions for the GUI
    public void chanceAction(Player player, Field[] fields, Player[] players) {
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
                moveToStart(player);
                break;
            case 4:
                birthday(player, players);
                break;
            default:
                break;


        }

    }

    private void changeBalance(Player p){
        p.getAccount().changeScore(amount);
    }

    private void moveByAmount(Player p, Field[] fields){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int currentPos = p.getPos();
        currentPos = (currentPos + amount)%fields.length;
        p.setPos(currentPos);
    }

    private void moveToColour(Player p, Field[] fields){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int destination = nextFieldOfColour(p, fields);

        if (destination != -1) {
            p.setPos(destination);
        }
    }

    private void moveToStart(Player p){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        p.setPos(0);
        p.getAccount().changeScore(amount);
    }

    private void birthday(Player player, Player[] players){
        for (Player p : players){
            p.getAccount().changeScore(-amount);
        }

        player.getAccount().changeScore(amount * players.length);
    }

    private int nextFieldOfColour(Player p, Field[] fields){
        for (int i = p.getPos(); i < fields.length; i++) {
            if (fields[i].getBgColour() == colour) {
                return i;
            }
        }

        for (int i = 0; i < p.getPos(); i++) {
            if (fields[i].getBgColour() == colour) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public String toString() {
        switch (actionType) {
            case 0:
                return "You get " + amount + "$";
            case 1:
                return "You move " + amount + " fields";
            case 2:
                return "You move to the next " + getColorName() + " field";
            case 3:
                return "You move to Start and get " + amount + "$";
            case 4:
                return "It's your birthday! all players gives you " + amount + "$";
            default:
                return "Couldn't find card text";
        }
    }

    private String getColorName() {
        if (colour.equals(Color.BLUE))
            return "blue";
        else
            return "";
    }

}
