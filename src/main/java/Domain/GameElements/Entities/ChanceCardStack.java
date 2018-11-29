package Domain.GameElements.Entities;

import TechnicalServices.ChanceCardAction;
import TechnicalServices.Utility;

import java.awt.*;
import java.util.Iterator;

public class ChanceCardStack implements Iterator {

    private ChanceCard[] chanceCards;
    private int cardNum;

    private static ChanceCardStack stackInstance = null;

    public static ChanceCardStack getStackInstance() {
        if (stackInstance == null) {
            stackInstance = new ChanceCardStack();
        }

        return stackInstance;
    }

    private ChanceCardStack(){
        cardNum = 0;

        chanceCards = new ChanceCard[] {
                //TODO make the rest of the chance cards
                new ChanceCard(ChanceCardAction.MoveToStart, 2),
                new ChanceCard(ChanceCardAction.MoveByAmount, 5),
                new ChanceCard(ChanceCardAction.MoveToColour, Color.red),
                new ChanceCard(ChanceCardAction.MoveByAmount, 1),
                new ChanceCard(ChanceCardAction.ChangeBalance, -2),
                new ChanceCard(ChanceCardAction.MoveToColour, Color.blue),
                new ChanceCard(ChanceCardAction.MoveToColour, Color.cyan),
                new ChanceCard(ChanceCardAction.Birthday, 1),
                new ChanceCard(ChanceCardAction.MoveToColour, Color.pink),
                new ChanceCard(ChanceCardAction.ChangeBalance, 2)
        };

        Utility.shuffleCards(chanceCards);
    }


    public boolean hasNext() {
        if (cardNum+1 < chanceCards.length)
            return true;
        else
            return false;
    }

    public ChanceCard getCurrent(){
        return chanceCards[cardNum];
    }

    public ChanceCard next() {
        if (!hasNext()) {
            Utility.shuffleCards(chanceCards);
            cardNum = 0;
        }

        return chanceCards[cardNum++];
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
