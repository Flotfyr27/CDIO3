package Domain.Controller;


import Domain.GameElements.Board;
import Domain.GameElements.Entities.Die;

public class Controller {

    private Die die;
    private int pIndex;
    private Board board;

    //Constructor - starts game loop
    public Controller(Board board){
        die = new Die();
        this.board = board;
        pIndex = 0;
        gameLoop();
    }

    // Game loop
    public void gameLoop(){

    //Loop that runs the game in correct order
        do{

            board.movePlayer(board.getPlayers()[pIndex],die.Roll());

            nextPlayer();
        }while(true);

    }

    private void nextPlayer(){
        pIndex = ++pIndex%board.getPlayers().length;
    }

}
