package Domain.Controller;


import Domain.GameElements.Board;
import Domain.GameElements.Entities.Die;
import UI.GUI.GuiHandler;

public class Controller {

    private Die die;
    private int pIndex;
    private Board board;
    private GuiHandler guiHandler;

    //Constructor - starts game loop
    public Controller(Board board, GuiHandler guiHandler){
        die = new Die();
        this.board = board;
        pIndex = 0;
        this.guiHandler = guiHandler;
        gameLoop();
    }

    // Game loop
    public void gameLoop(){

    //Loop that runs the game in correct order
        do{

            nextPlayer();
        }while(true);

    }

    private void nextPlayer(){
        pIndex = ++pIndex%board.getPlayers().length;
    }

}
