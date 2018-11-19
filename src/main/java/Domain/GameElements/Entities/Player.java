package Domain.GameElements.Entities;

public class Player {
    int pPos;

    public Player(){
        pPos = 0;
    }

    public void setPos(int pPos) {
        this.pPos = pPos;
    }

    public int getPos(){
        return pPos;
    }

}
