package Frame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame {

    JLabel label;

    MyFrame(){
    JFrame frame = new JFrame("A Simple Swing Application");
    frame.setLayout (new FlowLayout());

    frame.setSize(220,90);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton buttonA = new JButton("Alpha");
    JButton buttonB = new JButton("Beta");

    buttonA.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            label.setText("Alpha was pressed.");
        }
    });

    buttonB.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            label.setText("Beta was pressed.");
        }
    });
    
    frame.add(buttonA);
    frame.add(buttonB);

    label = new JLabel ("Press a button.");

    frame.add(label);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    }

public static void main(String args[]) {
    SwingUtilities.invokeLater(new Runnable() {
    public void run() {
        new MyFrame();
    }   
    });
    }
}
