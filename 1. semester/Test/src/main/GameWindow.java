package main;

import com.sun.tools.javac.Main;

import javax.swing.*;
public class GameWindow {
    void game() {
        JFrame f = new JFrame("The Twilight Zone");
        //set size and location of frame
        f.setSize(390, 300);
        f.setLocation(100, 150);
        //make sure it quits when x is clicked
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set look and feel
        f.setDefaultLookAndFeelDecorated(true);
        JLabel labelM = new JLabel("Not Only of Sight, but of: ");
        labelM.setBounds(50, 50, 200, 30);
        JTextField motto1 = new JTextField();
        //set size of the text box
        motto1.setBounds(50, 100, 200, 30);
        //add elements to the frame
        f.add(labelM);
        f.add(motto1);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
new GameWindow().game();
    }
}