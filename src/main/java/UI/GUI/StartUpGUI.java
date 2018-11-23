package UI.GUI;

import Domain.Controller.StartUpController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

public class StartUpGUI {
    private StartUpController controller;

    private JButton buttonPnum2;
    private JButton buttonPnum3;
    private JButton buttonPnum4;
    private JPanel jPanel;


    public StartUpGUI(){
        controller = new StartUpController();

        ImageIcon twoPlayerIcon = new ImageIcon("./Pictures/two-player.png");
        ImageIcon threePlayerIcon = new ImageIcon("./Pictures/three-player.png");
        ImageIcon fourPlayerIcon = new ImageIcon("./Pictures/four-player.png");

        twoPlayerIcon.setImage(twoPlayerIcon.getImage().getScaledInstance(150,100,1));
        threePlayerIcon.setImage(threePlayerIcon.getImage().getScaledInstance(150,100,1));
        fourPlayerIcon.setImage(fourPlayerIcon.getImage().getScaledInstance(150,100,1));

        final JFrame jFrame = new JFrame("Player selector");
        jFrame.setSize(600,300);
        jFrame.setLocation(1000, 500);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.add(jPanel);

        buttonPnum2.setIcon(twoPlayerIcon);
        buttonPnum3.setIcon(threePlayerIcon);
        buttonPnum4.setIcon(fourPlayerIcon);

        buttonPnum2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                jFrame.dispatchEvent(new WindowEvent(jFrame, WindowEvent.WINDOW_CLOSING));
                controller.startUp(2);
            }
        });

        buttonPnum3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                jFrame.dispatchEvent(new WindowEvent(jFrame, WindowEvent.WINDOW_CLOSING));
                controller.startUp(3);
            }
        });

        buttonPnum4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                jFrame.dispatchEvent(new WindowEvent(jFrame, WindowEvent.WINDOW_CLOSING));
                controller.startUp(4);
            }
        });

        jFrame.setVisible(true);
    }

}
