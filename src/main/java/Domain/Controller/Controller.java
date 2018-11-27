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

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.setupGame();
    }
}
