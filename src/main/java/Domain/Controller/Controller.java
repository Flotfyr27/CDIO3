package Domain.Controller;


import Domain.GameElements.Board;
import Domain.GameElements.Entities.Die;
import Domain.GameElements.Entities.Player;
import TechnicalServices.Logic.GameRules;
import UI.GUI.GuiHandler;

public class Controller {

    private Die die;
    private int pIndex;
    private Board board;
    private GuiHandler guiHandler;
    private GameRules rules;
    private Player[] players;

    //Constructor - starts game loop
    public Controller(Board board, GuiHandler guiHandler){
        die = new Die();
        this.board = board;
        players = board.getPlayers();
        pIndex = 0;
        this.guiHandler = guiHandler;
        rules = new GameRules(board.getPlayers());
        gameLoop();
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
