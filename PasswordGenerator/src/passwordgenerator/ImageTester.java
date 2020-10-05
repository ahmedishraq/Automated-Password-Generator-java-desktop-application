/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgenerator;

/**
 *
 * @author ishraq_ahmed 
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageTester extends JFrame {

    private ImageIcon img;
    private JLabel imgLabel;
    JLabel l1;

    ImageTester() {
        
        setTitle("Automated Password Generator");
        
        l1 = new JLabel("Thank you");
        l1.setFont(new Font("Raleway",Font.BOLD,38));
        
        l1.setBounds(320,330,500,50);
        add(l1);
        
        // Custom Background 
        img = new ImageIcon(getClass().getResource("bg.jpg"));

        imgLabel = new JLabel(img);
        imgLabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        add(imgLabel);

        setSize(850, 850);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new ImageTester().setVisible(true);
    }

}
