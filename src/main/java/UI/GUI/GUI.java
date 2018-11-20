/**
 * All GUI related classes are kept here.
 */
package UI.GUI;

import Domain.GameElements.Fields.Field;
import gui_fields.GUI_Empty;
import gui_fields.GUI_Field;
import gui_fields.GUI_Street;

import javax.swing.*;

public class GUI {

    private int playerTotal;
    GUI_Field[] gui_fields;

    public GUI(int numberOfPlayers, Field[] fields) {
        JFrame jFrame = new JFrame("message");
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jFrame.setVisible(true);

        playerTotal = numberOfPlayers;


        // number of fields
        initGuiFields(fields);


        GUI_Street MatadorStreet = new GUI_Street();
        GUI_Street testStreet = new GUI_Street();
        testStreet.getTitle();
        testStreet.getRent();
    }

        //for loop, for hvert field der er. Der skal sætte det ind i et array
        //lav et nyt array og return det array
        //dette er også skrevet forkert en metode skrives: public int GUI_Field[] <metodenavn>(){}
public GUI_Field[] initGuiFields(Field[] fields)  {

       gui_fields = new GUI_Field[fields.length];

       for (int i = 0; i < fields.length; i++){
           GUI_Empty
        }

        return




    }
    }




