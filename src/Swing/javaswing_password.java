package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//showing pasword//
public class javaswing_password implements ActionListener {
    public JFrame jFrame;//public Jframe
    public JLabel label;//public JLabel
    public JTextArea jTextArea;//Public Jtextarea
    public JPasswordField p;
    public javaswing_password(){
        jFrame = new JFrame();
        //--addd button----/
        JButton jButton = new JButton("check");
        jButton.setBounds(50, 150, 150, 30);
        jFrame.add(jButton);
        jButton.addActionListener(this);
        //jButton.addActionListener(this);

        //--Adding Level----//
        label = new JLabel("Password ");
        label.setBounds(40, 10, 250, 30);
        jFrame.add(label);
        //----------------//
        //=---add password----//
        p = new JPasswordField();
        p.setBounds(150, 10, 100, 20);
        jFrame.add(p);
        //-----//
        //----Adding Frame Layout---//
        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setTitle("Sriabhikkk");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//terminaitong the program

        //-----------------//
    }
    //working outside constructor/////
    //----action on click button----//
    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText(p.getText());
    }
    //-----------------------------//
    public static void main(String[] args) {
        javaswing_password j = new javaswing_password();

    }

}
