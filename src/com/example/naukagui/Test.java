package com.example.naukagui;
import java.awt.EventQueue;
/**
 * Created by Piotr on 02.04.2016.
 */
public class Test {
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame();
            }
        });
    }
}
