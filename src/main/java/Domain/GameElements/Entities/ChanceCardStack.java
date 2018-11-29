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
                new ChanceCard(ChanceCardAction.MoveByAmount, 5),
                new ChanceCard(ChanceCardAction.ChangeBalance, 3),
                new ChanceCard(ChanceCardAction.Birthday, 2),
                new ChanceCard(ChanceCardAction.MoveToColour, Color.BLUE)
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
        System.out.println(cardNum);
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
