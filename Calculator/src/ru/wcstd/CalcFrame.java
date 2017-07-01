package ru.wcstd;

import javax.swing.*;

class CalcFrame extends JFrame {
    public CalcFrame(){
        setTitle("Calculator");
        CalcPanel panel = new CalcPanel();
        add(panel);
        pack();
    }
}

