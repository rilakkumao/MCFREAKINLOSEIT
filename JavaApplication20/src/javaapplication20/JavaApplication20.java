package javaapplication20;
import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;

public class JavaApplication20 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(1000,1000);
        frame.setTitle("Warcraft 4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        frame.add(new Drawer());
    }        
}
