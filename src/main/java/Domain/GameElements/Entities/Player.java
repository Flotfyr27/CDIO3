package Domain.GameElements.Entities;

import Domain.Controller.Controller;

public class Player {
    private int pPos;
    private int totalValue;


    public Player(){
        pPos = 0;
    }

    public void setPos(int pPos) {
        this.pPos = pPos;
    }

    public int getPos(){
        return pPos;
    }
/*
    public boolean playerWon(){
        for(int value=0; value<200; value+//die.roll for en spiller)
        return false;
    }
*/

}
