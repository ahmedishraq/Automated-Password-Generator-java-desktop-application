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
import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator extends JFrame implements ActionListener {

    JLabel l1, l2, l3, msg1, msg2, msg3;
    JTextField t1;
    JButton b;
    //JCheckBox c1, c2, c3, c4, c5;
    JRadioButton r1, r2, r3, r4, r5;
    private ImageIcon img;
    private JLabel bg;

    PasswordGenerator() {

        setTitle("Automated Password Generator");

        l1 = new JLabel("Welcome To Automated Password Generator");
        l1.setFont(new Font("Raleway", Font.BOLD, 24));

        l2 = new JLabel("Enter the length of the password");
        l2.setFont(new Font("Raleway", Font.BOLD, 19));

        l3 = new JLabel("Choose an option");
        l3.setFont(new Font("Raleway", Font.BOLD, 19));

        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));

        b = new JButton("Generate");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);

        r1 = new JRadioButton("Caps words");
        r1.setBackground(Color.getHSBColor(195, 78, 79));
        r1.setFont(new Font("Raleway", Font.BOLD, 16));

        r2 = new JRadioButton("Small caps words");
        r2.setBackground(Color.getHSBColor(195, 78, 79));
        r2.setFont(new Font("Raleway", Font.BOLD, 16));

        r3 = new JRadioButton("Numbers");
        r3.setBackground(Color.getHSBColor(195, 78, 79));
        r3.setFont(new Font("Raleway", Font.BOLD, 16));

        r4 = new JRadioButton("Symbols");
        r4.setBackground(Color.getHSBColor(195, 78, 79));
        r4.setFont(new Font("Raleway", Font.BOLD, 16));

        r5 = new JRadioButton("All");
        r5.setBackground(Color.getHSBColor(195, 78, 79));
        r5.setFont(new Font("Raleway", Font.BOLD, 16));

        setLayout(null);

        l1.setBounds(160, 20, 600, 40);
        add(l1);

        l2.setBounds(100, 140, 500, 30);
        add(l2);

        l3.setBounds(250, 280, 500, 40);
        add(l3);

        t1.setBounds(440, 140, 100, 30);
        add(t1);

        r1.setBounds(100, 350, 200, 30);
        add(r1);

        r2.setBounds(350, 350, 200, 30);
        add(r2);

        r3.setBounds(100, 400, 200, 30);
        add(r3);

        r4.setBounds(350, 400, 200, 30);
        add(r4);

        r5.setBounds(100, 450, 200, 30);
        add(r5);

        b.setBounds(620, 550, 200, 50);
        add(b);

        //custom background 
        img = new ImageIcon(getClass().getResource("bg.jpg"));
        bg = new JLabel(img);
        bg.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        add(bg);

        b.addActionListener(this);

        //getContentPane().setBackground(Color.LIGHT_GRAY);
        setSize(850, 850);
        // setLocation(500, 90);
        // auto set the location of the frame in center 
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    static Scanner sc = new Scanner(System.in);

    static char[] generatePswd(int len) {
        // System.out.print("Your Password: ");
        String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        String symbols = "!@#$%^&*_=+/.?<>)";

        String passSymbols = charsCaps + chars + nums + symbols;
        Random rnd = new Random();

        char[] password = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));
        }
        return password;
    }

    static char[] generatePswdCaps(int len) {
        // System.out.print("Your Password: ");
        String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //String chars = "abcdefghijklmnopqrstuvwxyz";
        //String nums = "0123456789";
        //String symbols = "!@#$%^&*_=+/.?<>)";

        String passSymbols = charsCaps;
        Random rnd = new Random();

        char[] password = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));
        }
        return password;
    }

    static char[] generatePswdSmall(int len) {
        // System.out.print("Your Password: ");
        //String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        //String nums = "0123456789";
        //String symbols = "!@#$%^&*_=+/.?<>)";

        String passSymbols = chars;
        Random rnd = new Random();

        char[] password = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));
        }
        return password;
    }

    static char[] generatePswdNumber(int len) {
        // System.out.print("Your Password: ");
        //String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //String chars = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        //String symbols = "!@#$%^&*_=+/.?<>)";

        String passSymbols = nums;
        Random rnd = new Random();

        char[] password = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));
        }
        return password;
    }

    static char[] generatePswdSymbol(int len) {
        // System.out.print("Your Password: ");
        //String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //String chars = "abcdefghijklmnopqrstuvwxyz";
        //String nums = "0123456789";
        String symbols = "!@#$%^&*_=+/.?<>)";

        String passSymbols = symbols;
        Random rnd = new Random();

        char[] password = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));
        }
        return password;
    }

    public void actionPerformed(ActionEvent ae) {
        String a = t1.getText();

        try {
            if (t1.getText().equals("")) {
                //JOptionPane.showMessageDialog(null, "Please provide the password length");

                // Custom JOptionPane.showMessageDialog().
                msg1 = new JLabel("Please provide the password length");
                msg1.setFont(new Font("Raleyway", Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, msg1);
            } else {

                // convert the string value of  t1 into int 
                int length = Integer.valueOf(a);

                // save the generatePswd method's return value into a char array 
                //char[] p = generatePswd(length);
                //convert the char array into a string 
                //String str = String.valueOf(p);
                //JOptionPane.showMessageDialog(null, "Your Password: " + str);
                // new version adding 
                if (r1.isSelected() && r2.isSelected() || r3.isSelected() && r4.isSelected() || r5.isSelected() && r1.isSelected() || r1.isSelected() && r3.isSelected() || r1.isSelected() && r4.isSelected() || r2.isSelected() && r3.isSelected() || r2.isSelected() && r4.isSelected() || r2.isSelected() && r5.isSelected()
                        || r3.isSelected() && r5.isSelected() || r4.isSelected() && r5.isSelected()) {

                    //JOptionPane.showMessageDialog(null, "You have to select any one option.");
                    // JOptionPane.showMessageDialog accepts JLabel , to custom the font it can be used.
                    msg2 = new JLabel("You have to select any one option");
                    msg2.setFont(new Font("Raleway", Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, msg2);
                } else {
                    if (r1.isSelected()) {
                        char[] pa = generatePswdCaps(length);
                        String pastr = String.valueOf(pa);
                        //JOptionPane.showMessageDialog(null, "Your Password: " + pastr);

                        // Custom JOptionPane.showMessageDialog().
                        msg1 = new JLabel("Your Password: " + pastr);
                        msg1.setFont(new Font("Raleway", Font.BOLD, 18));
                        JOptionPane.showMessageDialog(null, msg1);
                    }

                    if (r2.isSelected()) {
                        char[] pa = generatePswdSmall(length);
                        String pastr = String.valueOf(pa);
                        //JOptionPane.showMessageDialog(null, "Your Password: " + pastr);

                        // Custom JOptionPane.showMessageDialog().
                        msg3 = new JLabel("Your Password: " + pastr);
                        msg3.setFont(new Font("Raleway", Font.BOLD, 18));
                        JOptionPane.showMessageDialog(null, msg3);
                    }

                    if (r3.isSelected()) {
                        char[] pa = generatePswdNumber(length);
                        String pastr = String.valueOf(pa);
                        //JOptionPane.showMessageDialog(null, "Your Password: " + pastr);

                        // Custom JOptionPane.showMessageDialog().
                        msg1 = new JLabel("Your Password: " + pastr);
                        msg1.setFont(new Font("Raleway", Font.BOLD, 18));
                        JOptionPane.showMessageDialog(null, msg1);
                    }

                    if (r4.isSelected()) {
                        char[] pa = generatePswdSymbol(length);
                        String pastr = String.valueOf(pa);
                        //JOptionPane.showMessageDialog(null, "Your Password: " + pastr);

                        // Custom JOptionPane.showMessageDialog().
                        msg1 = new JLabel("Your Password: " + pastr);
                        msg1.setFont(new Font("Raleway", Font.BOLD, 18));
                        JOptionPane.showMessageDialog(null, msg1);
                    }

                    if (r5.isSelected()) {
                        char[] pall = generatePswd(length);
                        String pallstr = String.valueOf(pall);
                        // JOptionPane.showMessageDialog(null, "Your Password: " + pallstr);

                        // Custom JOptionPane.showMessageDialog().
                        msg1 = new JLabel("Your Password: " + pallstr);
                        msg1.setFont(new Font("Raleway", Font.BOLD, 18));
                        JOptionPane.showMessageDialog(null, msg1);
                    }
                    // new option is in under development 
                    new Login().setVisible(true);
                    setVisible(false);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        /*  System.out.print("Enter the length of the password you want to generate: ");
        int length = sc.nextInt();
        System.out.println(generatePswd(length)); */
        new PasswordGenerator().setVisible(true);
    }

}
