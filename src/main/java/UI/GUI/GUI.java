/**
 * All GUI related classes are kept here.
 */
package UI.GUI;

import Domain.GameElements.Fields.Field;
import gui_fields.GUI_Field;
import gui_fields.GUI_Street;

import javax.swing.*;

public class GUI {

    private int playerTotal;
    private int fieldNum = 24;
    private Field[] bfields;
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

        //for loop, for hvert field der er. Der skal sætte det ind i et array
        //lav et nyt array og return det array
        //dette er også skrevet forkert en metode skrives: public int GUI_Field[] <metodenavn>(){}
public int GUI_Field[] afield()  {
       GUI_Field = new int[bfields][];
        for (int i = 0; i < GUI_Field.length; i++){
            GUI_Field[i] = new bfields[i];
            return bfields[]
        }





    }
    }




