package Domain.Controller;

import Domain.GameElements.Board;
import UI.GUI.GUI;


public class StartUpController {

    public void startUp(int pNum){


        Board board = new Board();
        GUI gui = new GUI(2, board.getFields());
        Controller controller = new Controller(board);
    }

}
