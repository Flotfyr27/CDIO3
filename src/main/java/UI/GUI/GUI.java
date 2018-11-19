/**
 * All GUI related classes are kept here.
 */
package UI.GUI;
import gui_fields.GUI_Field;
import gui_fields.GUI_Street;

import javax.swing.*;

//import desktop_fields.*;

public class GUI {

    private int playerTotal;
    private int fieldNum = 24;

    public GUI(int numberOfPlayers) {
        JFrame jFrame = new JFrame("message");
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jFrame.setVisible(true);

        playerTotal = numberOfPlayers;


                // number of fields
                GUI_Field[] fields = new GUI_Field[fieldNum];


        GUI_Street MatadorStreet = new GUI_Street();
        GUI_Street testStreet= new GUI_Street();
        testStreet.getTitle();
        testStreet.getRent();
        fields[1] = testStreet;
    }

    public GUI_Field[] initFields(){

        //for loop, for hvert field der er. Den skal sætte det ind i et array
        //lav et nyt array og return det array



    }


}


