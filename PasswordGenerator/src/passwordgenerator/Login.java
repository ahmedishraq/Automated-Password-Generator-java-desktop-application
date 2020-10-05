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
import java.util.Random;
import javax.swing.*;
import java.io.FileWriter;

public class Login extends JFrame implements ActionListener {

    private ImageIcon img;
    private JLabel bg;
    private JLabel l1, l2, l3, l4;
    private JTextField t1, t2;
    private JButton b1, b2;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    long first = Math.abs(first4);

    Login() {
        
        setTitle("Automated Password Generator");

        l1 = new JLabel("Welcome to Automated Password Generator");
        l1.setFont(new Font("Raleway", Font.BOLD, 24));

        l2 = new JLabel("Email");
        l2.setFont(new Font("Raleway", Font.BOLD, 19));

        l3 = new JLabel("Enter the Captcha");
        l3.setFont(new Font("Raleway", Font.BOLD, 19));

        l4 = new JLabel("Captcha " + first);
        l4.setFont(new Font("Raleway", Font.BOLD, 19));

        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 15));

        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 15));

        b1 = new JButton("Clear");
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2 = new JButton("Login");
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        l1.setBounds(160, 20, 600, 40);
        add(l1);

        l2.setBounds(100, 140, 500, 30);
        add(l2);

        l3.setBounds(100, 200, 500, 30);
        add(l3);

        l4.setBounds(380, 260, 600, 40);
        add(l4);

        t1.setBounds(300, 140, 300, 30);
        add(t1);

        t2.setBounds(300, 200, 300, 30);
        add(t2);

        b1.setBounds(300, 400, 100, 30);
        add(b1);

        b2.setBounds(430, 400, 100, 30);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        //custom background 
        img = new ImageIcon(getClass().getResource("bg.jpg"));
        bg = new JLabel(img);
        bg.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        add(bg);

        //getContentPane().setBackground(Color.LIGHT_GRAY);
        setSize(850, 850);
        // setLocation(500, 90);
        // auto set the location of the frame in center 
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {
        String a = t1.getText();
        String b = t2.getText();

        try {
            if(ae.getSource() == b2){
            if (t1.getText().equals("") || t2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill up all the required fields");
            } else {
                try{
                    // saving the user input in a txt file .
                    FileWriter Writer = new FileWriter("database.txt",true); 
                    Writer.write(""+b+" "+a);
                    // make a new line in the txt file for another data.
                    Writer.write(System.getProperty("line.separator"));
                    Writer.close();
                }
                catch(Exception e){
                e.printStackTrace();
                }
                // long converted into string.
                String capt = String.valueOf(first);
                if (b.equals(capt)) {
                    new PasswordGenerator().setVisible(true);
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "You entered wrong captcha please check it again");
                }
            }
            }
            else if(ae.getSource() == b1){
            t1.setText("");
            t2.setText("");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login().setVisible(true);
    }

}
