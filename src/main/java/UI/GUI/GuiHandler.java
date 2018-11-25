/**
 * All GuiHandler related classes are kept here.
 */
package UI.GUI;

import Domain.GameElements.Fields.Field;
import gui_fields.*;
import gui_main.GUI;

import javax.swing.*;
import java.awt.*;

public class GuiHandler {
    // brug matador guien i denne klasse. lad den håndtere hvordan den styres

    GUI_Field[] gui_fields;
    GUI gui;

    //for loop, for hvert field der er. Der skal sætte det ind i et array
    //lav et nyt array og return det array
    public void initGuiFields(Field[] fields) {

        gui_fields = new GUI_Field[fields.length];

        for (int i = 0; i < fields.length; i++){
            gui_fields[i] = new GUI_Street("Test", "tests the gui", "", "200 kr", Color.BLUE,Color.cyan);
        }
    }

    public GuiHandler(int numberOfPlayers, Field[] fields) {
        /*
        JFrame jFrame = new JFrame("Junior Monopoly");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(1000,500);

        jFrame.setVisible(true);
        */

        // number of fields
        initGuiFields(fields);
        gui = new GUI(gui_fields);
        //jFrame.add(gui);

        //Lav et for loop for at beskrive antallet at spillere. (nødvendigt for GuiHandler'en)

        GUI_Street MatadorStreet = new GUI_Street();
        GUI_Street testStreet = new GUI_Street();
        testStreet.getTitle();
        testStreet.getRent();
    }
    }




