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

    public void initGuiFields(Field[] fields) {

    }

    public GuiHandler(int numberOfPlayers, Field[] fields) {
        initGuiFields(fields);
        gui = new GUI(fieldObj, Color.WHITE);
    }
}




