package Domain.GameElements.Entities;

import TechnicalServices.ChanceCardAction;

public class ChanceCard {
    //TODO : Fill out the chancecard class

    int actionType;
    int amount;

    public ChanceCard(ChanceCardAction actionType, int amount){
        this.actionType = actionType.ordinal();
        this.amount = amount;
    }

    public void chanceAction(Player player){
        switch (actionType) {
            case 0:
                changeBalance(player);
                break;
            case 1:
                movePlayer(player);
                break;
        }

    }

    private void changeBalance(Player p){
        p.getAccount().changeScore(amount);

    }

    private void movePlayer(Player p){

    }

}
