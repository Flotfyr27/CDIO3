package Domain.Controller;

import Domain.GameElements.*;
import UI.GUI.*;



public class StartUpController {

    public void startUp(int pNum){


        Board board = new Board();
        GuiHandler gui = new GuiHandler(pNum ,board.getFields());
        Controller controller = new Controller(board, gui);
    }

}
