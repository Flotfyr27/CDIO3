package Domain.Controller;


import Domain.GameElements.Board;
import Domain.GameElements.Entities.ChanceCard;
import Domain.GameElements.Entities.Die;
import TechnicalServices.Logic.GameRules;
import UI.GUI.GuiHandler;

public class Controller {

    private Die die = new Die();
    private Board board;
    private GuiHandler guiHandler;
    private ChanceCard[] cards;
    private int currentPlayer = 0;
    private GameRules GR = new GameRules();

    private boolean winnerFound = false;

    private void setupGame(){
        board = new Board();
        guiHandler = new GuiHandler(board.getFields());
        board.initPlayers(guiHandler.getNumberOfPlayers(2, 4));
        guiHandler.initGui(board.getPlayers());
    }
    private void gameLoop(){
        while(!winnerFound){
            takeTurn();
            guiHandler.updateGui(board.getPlayers(), board.getFields());
            switchPlayer();
            checkForWin();
        }
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.setupGame();
        controller.gameLoop();
    }

    private void takeTurn(){
        guiHandler.giveMsg("Player" + (currentPlayer+1) + " please roll a die");
        int rollValue = die.Roll();
        board.movePlayer(board.getPlayers()[currentPlayer],rollValue);
        guiHandler.giveMsg("You rolled a " + rollValue);
        //landOnAction?
    }

    private void switchPlayer(){
        if(currentPlayer == 3){
            currentPlayer = 0;
        }else{
            currentPlayer++;
        }
    }
    private void checkForWin(){
        for(int i = 0; i < board.getPlayers().length; i++){
           winnerFound = GR.hasLost(board.getPlayers()[currentPlayer]);
        }
    }
}
