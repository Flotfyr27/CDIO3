package Domain.GameElements.Entities;

import Domain.Controller.Controller;

public class Player {
    private int pPos;
    private Account account;

    public Player(){
        pPos = 0;
        account = new Account();
    }

    public void setPos(int pPos) {
        this.pPos = pPos;
    }

    public int getPos(){
        return pPos;
    }

    public Account getAccount() {
        return account;
    }
}
