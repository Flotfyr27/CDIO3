package Domain.Controller;

import Domain.GameElements.*;
import UI.GUI.*;

public class StartUpController {

    public static void main(String[] args) {
        Board board = new Board();
        GUI gui = new GUI(2, board.getFields());
        Controller controller = new Controller(board);
    }

}
