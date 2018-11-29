package Domain.Controller;


import Domain.GameElements.Board;
import Domain.GameElements.Entities.ChanceCard;
import Domain.GameElements.Entities.Die;
import Domain.GameElements.Entities.Player;
import Domain.GameElements.Fields.Field;
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
    private void gameLoop() throws InterruptedException {
        while(!winnerFound){
            takeTurn();
            guiHandler.updateGui(board.getPlayers(), board.getFields());
            checkForWin();
            switchPlayer();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Controller controller = new Controller();
        controller.setupGame();
        controller.gameLoop();
    }

    private void takeTurn() throws InterruptedException {
        Field currentField;
        Player selectedPlayer = board.getPlayers()[currentPlayer];

        guiHandler.waitForRoll("Player" + (currentPlayer + 1) + " please roll a die");
        int rollValue = die.Roll();
        guiHandler.showDie(rollValue);
        Thread.sleep(400); //setting delay between roll and moving of the car.
        board.movePlayer(selectedPlayer, rollValue);
        guiHandler.updateGui(board.getPlayers(), board.getFields());

        currentField = board.getFields()[selectedPlayer.getPos()];
        guiHandler.msgInMidle(currentField.toString());
        currentField.landOnAction(selectedPlayer, board.getPlayers(), board.getFields());

    }

    private void switchPlayer(){
        if(currentPlayer == (board.getPlayers().length-1)){
            currentPlayer = 0;
        }else{
            currentPlayer++;
        }
    }
    private void checkForWin(){
        for(int i = 0; i < board.getPlayers().length; i++){
           winnerFound = GR.hasLost(board.getPlayers()[currentPlayer]);
        }
        if(winnerFound){
            guiHandler.msgInMidle("Game Over!\n" +
                    GR.getWinner(board.getPlayers()).getName() + " Won!!!");
        }
    }
}
