package Domain.GameElements.Entities;

import Domain.GameElements.Fields.Field;
import TechnicalServices.ChanceCardAction;

public class ChanceCard {
    //TODO : Fill out the chancecard class

    int actionType;
    int amount;

    public ChanceCard(ChanceCardAction actionType, int amount){
        this.actionType = actionType.ordinal();
        this.amount = amount;
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
        //p.setPos(amount);
    }

}
