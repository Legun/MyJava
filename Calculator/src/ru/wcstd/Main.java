package ru.wcstd;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Main {
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable(){
            public void run(){
                CalcFrame frame = new CalcFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
