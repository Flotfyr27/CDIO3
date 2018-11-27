package Domain.Controller;


import Domain.GameElements.Board;
import Domain.GameElements.Entities.ChanceCard;
import Domain.GameElements.Entities.Die;
import UI.GUI.GuiHandler;

public class Controller {

    private Die die;
    private Board board;
    private GuiHandler guiHandler;
    private ChanceCard[] cards;
    private int currentPlayer = 0;

    private boolean noWinner = true;

    private void setupGame(){
        board = new Board();
        guiHandler = new GuiHandler(board.getFields());
        board.initPlayers(guiHandler.getNumberOfPlayers(2, 4));
        guiHandler.initGui(board.getPlayers());
    }
    private void gameLoop(){
        while(noWinner){
            takeTurn();
            guiHandler.updateGui(board.getPlayers(), board.getFields());
            //switchPlayer();
            //checkForWin();
        }
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.setupGame();
    }

    private void takeTurn(){
        guiHandler.giveMsg("Roll die");
        int rollValue = die.Roll();
        board.movePlayer(board.getPlayers()[currentPlayer],rollValue);
        guiHandler.giveMsg("You rolled a " + rollValue);
        //landOnAction?
    }
}
