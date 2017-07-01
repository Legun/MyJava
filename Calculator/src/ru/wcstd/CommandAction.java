package ru.wcstd;

import java.awt.*;
import java.awt.event.*;

private class CommandAction implements ActionListener {
    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        if(start){
            if(command.equals("-")){
                display.setText(command);
                start = false;
            }
            else lastCommand = command;
        }
        else{
            calculate(Double.parseDouble(display.getText()));
            lastCommand = command;
            start = true;
            }
        }
        public void calculate(double x){
        if(lastCommand.equals("+")) result += x;
        else if(lastCommand.equals("-")) result -= x;
        else if(lastCommand.equals("*")) result *= x;
        else if(lastComand.equals("/")) result /= x;
        else if(lastComand.equals("=")) result = x;
        display.setText("" + result);
        }
    }
