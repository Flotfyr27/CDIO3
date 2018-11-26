/**
 * All GuiHandler related classes are kept here.
 */
package UI.GUI;

import Domain.GameElements.Fields.ChanceField;
import Domain.GameElements.Fields.EmptyField;
import Domain.GameElements.Fields.Field;
import Domain.GameElements.Fields.PropertyField;
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
            if(fields[i].getClass().equals(EmptyField.class) && i == 0){
                gui_field[i] = (new GUI_Start(fields[i].getName(), "", fields[i].getDescription(), Color.lightGray, null));
            }else if(fields[i].getClass().equals(PropertyField.class)){
                PropertyField propertyField = (PropertyField) fields[i];
                gui_field[i] = (new GUI_Street(fields[i].getName(), "", fields[i].getDescription(), Integer.toString(propertyField.getRent()), Color.lightGray, null));
            }else if(fields[i].getClass().equals(EmptyField.class)){
                gui_field[i] = (new GUI_Empty(Color.lightGray, null, fields[i].getName(), "", fields[i].getDescription()));
            }else if(fields[i].getClass().equals(ChanceField.class)){
                gui_field[i] = (new GUI_Chance(fields[i].getName(), "", fields[i].getDescription(), Color.lightGray, null));
            }
        }
        gui = new GUI(gui_field, Color.GREEN);
    }
}




