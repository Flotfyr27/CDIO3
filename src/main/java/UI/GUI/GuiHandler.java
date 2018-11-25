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
    GUI gui;
    GUI_Field[] gui_field = new GUI_Field[24];
    //TODO : Change constructor so that fields are read from a parameter and not hardcoded.
    public GuiHandler(Field[] fields){
        for(int i = 0; i < gui_field.length; i++){
            gui_field[i] = (new GUI_Street(fields[i].getName(), "", fields[i].getDescription(), "200", Color.lightGray, null));
        }
        gui = new GUI(gui_field, Color.GREEN);
    }
}




