/**
 * All GUI related classes are kept here.
 */
package UI.GUI;

import Domain.GameElements.Fields.Field;
import gui_fields.GUI_Empty;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Street;

import javax.swing.*;

public class GUI {

    GUI_Field[] gui_fields;

    //for loop, for hvert field der er. Der skal sætte det ind i et array
    //lav et nyt array og return det array
    public void initGuiFields(Field[] fields) {

        gui_fields = new GUI_Field[fields.length];

        for (int i = 0; i < fields.length; i++){
            gui_fields[i] = new GUI_Empty();
        }
    }

    public GUI(int numberOfPlayers, Field[] fields) {
        JFrame jFrame = new JFrame("Junior Monopoly");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jFrame.setVisible(true);


        // number of fields
        initGuiFields(fields);

       // GUI_Player  lav loop omkring denne

                //Lav et for loop for at beskrive antallet at spillere. (nødvendigt for GUI'en)

        GUI_Street MatadorStreet = new GUI_Street();
        GUI_Street testStreet = new GUI_Street();
        testStreet.getTitle();
        testStreet.getRent();
    }
    }




