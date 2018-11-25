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

   private GUI_Field[] fieldObj;
   private GUI gui;

    /**
     * This method takes an array of type Field and fills an object of type GUI_Fields[] with GUI_Street elements.
     * @param fields This parameter is given when the method is called an consists of all the fields necessary to describe the gameboard.
     */
    public void initGuiFields(Field[] fields) {
        fieldObj = new GUI_Field[fields.length];
        for(int i = 0; i < fields.length; i++){
            //fieldObj[i] = (new GUI_Street(fields[i].getTitle(), fields[i].getSubtext(), fields[i].getDescription(), fields[i].getRent(), Color.lightGray, null));
            fieldObj[i] = (new GUI_Street("Title", "Subtext", "Description", "200", Color.lightGray, null));
        }
    }


    public GuiHandler(int numberOfPlayers, Field[] fields) {
        initGuiFields(fields);
        gui = new GUI(fieldObj);
    }
}




