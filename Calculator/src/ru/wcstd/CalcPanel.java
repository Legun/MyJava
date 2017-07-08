package ru.wcstd;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CalcPanel extends JPanel {

    private JButton display;
    private JPanel panel;
    private double result;
    private String lastCommand;
    private boolean start;

    public CalcPanel(){
        setLayout(new BorderLayout());
        
        result = 0;
        lastCommand = "=";
        start=true;
    
        display = new JButton("0");
        display.setEnabled(false);
        add(display, BorderLayout.NORTH);

        ActionListener insert = new InserAction();
        ActionListener command = new CommandAction();

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        addButton("7", insert);
        addButton("8", insert);
        addButton("9", insert);
        addButton("/", command);

        addButton("4", insert);
        addButton("5", insert);
        addButton("6", insert);
        addButton("*", command);

        addButton("1", insert);
        addButton("2", insert);
        addButton("3", insert);
        addButton("-", command);

        addButton("0", insert);
        addButton(".", insert);
        addButton("=", command);
        addButton("+", command);

        add(panel, BorderLayout.CENTER);
    }
    private void addButton(String label, ActionListener listener){
        JButton button = new JButton(label);
        button.addActionListener(listener);
        panel.add(button);
    }
    
    private class InserAction implements ActionListener {
        public void actionPerformed(actionEvent e){
            String input = e.getActionCommand();
            if(start){
                display.setText("");
                start = false;
            }
            display.setText(display.getText()+input);
        }
    }
}





