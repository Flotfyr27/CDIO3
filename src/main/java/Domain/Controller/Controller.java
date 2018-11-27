package Domain.Controller;


import Domain.GameElements.Board;
import Domain.GameElements.Entities.ChanceCard;
import Domain.GameElements.Entities.Die;
import Domain.GameElements.Entities.Player;
import TechnicalServices.Logic.GameRules;
import UI.GUI.GuiHandler;

public class Controller {

    private Die die;
    private Board board;
    private GuiHandler guiHandler;
    private ChanceCard[] cards;

private void setupGame(){
    board = new Board();
    guiHandler = new GuiHandler(board.getFields());
    board.initPlayers(guiHandler.getNumberOfPlayers(2, 4));
    guiHandler.initGui(board.getPlayers());
}

    /**
     *  Game loop that goes through steps of the game round
     */
    public void gameLoop(){
//TODO https://www.dotnetperls.com/shuffle-java
        /*try {
            wait(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        //Loop that runs the game in correct order
        do{


            guiHandler.addButton();

            board.movePlayer(players[pIndex], die.Roll());

            nextPlayer();
        }while (!rules.hasLost(board.getPlayers()[pIndex]));

    }

    private void nextPlayer(){
        pIndex = ++pIndex%board.getPlayers().length;
    }

}
