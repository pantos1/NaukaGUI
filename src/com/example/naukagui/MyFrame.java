package com.example.naukagui;
import javax.swing.*;

/**
 * Created by Piotr on 02.04.2016.
 */
public class MyFrame extends JFrame{

    public MyFrame(){
        super("NaukaGUI");
        JPanel panel = new MyPanel();
        add(panel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
