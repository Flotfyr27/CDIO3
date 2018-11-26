import Domain.GameElements.Board;
import UI.GUI.GuiHandler;

public class GuiHandlerTest {

    public static void main(String[] args) {
        Board board = new Board(2);
       GuiHandler guiHandler = new GuiHandler(board.getFields());
    }
}
