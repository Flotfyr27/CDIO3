package Domain.Controller;

import Domain.GameElements.*;
import UI.GUI.*;



public class StartUpController {

    public void startUp(int pNum){


        Board board = new Board();
        //TODO : Fix GUI so that parameters are added
        GuiHandler gui = new GuiHandler(board.getFields());
        Controller controller = new Controller(board, gui);
    }

}
