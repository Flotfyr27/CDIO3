package Domain.Controller;

import Domain.GameElements.*;
import UI.GUI.*;
import com.sun.deploy.util.Waiter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class StartUpController {

    public void startUp(int pNum){


        Board board = new Board();
        GUI gui = new GUI(2, board.getFields());
        Controller controller = new Controller(board);
    }

}
