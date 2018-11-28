/**
 * All GuiHandler related classes are kept here.
 */
package UI.GUI;

import Domain.GameElements.Entities.Player;
import Domain.GameElements.Fields.ChanceField;
import Domain.GameElements.Fields.EmptyField;
import Domain.GameElements.Fields.Field;
import Domain.GameElements.Fields.PropertyField;
import gui_fields.*;
import gui_main.GUI;

import java.awt.*;

public class GuiHandler {
    GUI gui;
    GUI_Field[] gui_field = new GUI_Field[24];
    GUI_Player[] guiPlayers;
    public GuiHandler(Field[] fields){//Field[] fields
        for(int i = 0; i < gui_field.length; i++){
            if(fields[i].getClass().equals(EmptyField.class) && i == 0){
                gui_field[i] = (new GUI_Start(fields[i].getName(), fields[i].getSubtext(), "", fields[i].getBgColour(), null));
            }else if(fields[i].getClass().equals(PropertyField.class)){
                PropertyField propertyField = (PropertyField) fields[i];
                gui_field[i] = (new GUI_Street(fields[i].getName(), fields[i].getSubtext(), "", Integer.toString(propertyField.getPrice()), fields[i].getBgColour(), null));
            }else if(fields[i].getClass().equals(EmptyField.class)){
                gui_field[i] = (new GUI_Street(fields[i].getName(), fields[i].getSubtext(), "", "0", fields[i].getBgColour(), null));//This one be causing trouble
            }else if(fields[i].getClass().equals(ChanceField.class)){
                gui_field[i] = (new GUI_Chance(fields[i].getName(), fields[i].getSubtext(), "", fields[i].getBgColour(), null));
            }
        }

        gui = new GUI(gui_field, Color.lightGray);
    }

    /**
     * Methods returns an integer given by a player
     * @param min The minimum number of players
     * @param max The maximum number of players
     */
    public int getNumberOfPlayers(int min, int max){
        return gui.getUserInteger("How many players are present?", min, max);
    }

    public void initGui(Player[] p){
        GUI_Car.Type carType;
        Color primaryColor;
        //Create players
        guiPlayers = new GUI_Player[p.length];
        for(int i = 0; i < p.length; i++){
            switch (i){
                case 0:{
                    carType = GUI_Car.Type.CAR;
                    primaryColor = Color.RED;
                    break;
                }
                case 1:{
                    carType = GUI_Car.Type.RACECAR;
                    primaryColor = Color.GREEN;
                    break;
                }
                case 2:{
                    carType = GUI_Car.Type.TRACTOR;
                    primaryColor = Color.CYAN;
                    break;
                }
                case 3:{
                    carType = GUI_Car.Type.UFO;
                    primaryColor = Color.MAGENTA;
                    break;
                }
                default:{
                    carType = GUI_Car.Type.CAR;
                    primaryColor = Color.BLUE;
                    break;
                }
            }
            guiPlayers[i] = new GUI_Player("Player" + (i+1), p[i].getAccount().getScore(), new GUI_Car(primaryColor, Color.WHITE, carType, GUI_Car.Pattern.HORIZONTAL_LINE));
            //Add players to GUI
            gui.addPlayer(guiPlayers[i]);
            guiPlayers[i].setBalance(p[i].getAccount().getScore());
            //Adds the players car to the board at START
            gui_field[0].setCar(guiPlayers[i], true);
        }


    }

    public void updateGui(Player[] p, Field[] f){
        //Remove all cars
        for(int i = 0; i < 24; i++){
            gui_field[i].removeAllCars();
        }
        //Update player balance and location
        for(int i = 0; i < p.length; i++){
            guiPlayers[i].setBalance(p[i].getAccount().getScore());
            gui_field[p[i].getPos()].setCar(guiPlayers[i], true);
        }
        //Update ownership of tile
        //TODO : Display who owns a tile (code below)
        Player ownerPlayer;
        for(int i = 0; i < gui_field.length; i++){
            if(gui_field[i].getClass().equals(PropertyField.class)){
                ownerPlayer = ((PropertyField) f[i]).getOwner();
                gui_field[i].setSubText(ownerPlayer.getName());
            }
        }

    }

    public void giveMsg(String msg){
        gui.showMessage(msg);
    }
}




