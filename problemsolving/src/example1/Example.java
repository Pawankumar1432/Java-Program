package example1;
 
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

class Example extends JFrame {

  public Example(){
    String text = new String("I'm a simple Program ");
    String text2 = text.concat(
      "that uses classes and objects");

    JLabel label = new JLabel(text2);
    JPanel panel = new JPanel();
    panel.setBackground(Color.white);

    getContentPane().add(panel);
    panel.add(label);
  }

  public static void main(String[] args){
    Example frame = new Example();

    frame.setTitle("Fruit $1.25 Each");
    WindowListener l = new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    };

    frame.addWindowListener(l);
    frame.pack();
    frame.setVisible(true);
  }
}
