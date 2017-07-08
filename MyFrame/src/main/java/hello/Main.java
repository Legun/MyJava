package hello;

import javax.swing.*;
import java.awt.Font;

class Main extends JFrame {

    Main(){

    JFrame frame;
    JPanel panel;
    JLabel label;
    Font font;
    
    frame = new JFrame ("Title My New Frame");
    frame.setSize(300,300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);

    font = new Font ("Serif", Font.BOLD | Font.ITALIC, 32);
    
    label = new JLabel ("Hello World!", JLabel.CENTER);
    label.setFont(font);

    


    frame.add(label);
    frame.setVisible(true);
}
    public static void main(String args[]){

        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new Main();
            }
        });
    }
}
