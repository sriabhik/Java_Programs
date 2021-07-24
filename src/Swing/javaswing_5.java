package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaswing_5 implements ActionListener {
    public JFrame jFrame;//public Jframe
    public JLabel t;//public JLabel
    public JTextArea jTextArea;//Public Jtextarea

    public javaswing_5(){
        jFrame  = new JFrame();

        //----adding textarea with color and text---//
        jTextArea = new JTextArea("Enter");
        jTextArea.setBounds(40,40,250,250);
        jTextArea.setBackground(Color.CYAN);
        jTextArea.setForeground(Color.red);
        jFrame.add(jTextArea);
        //--------------------------------------///
        //---adding button---//
        JButton jButton = new JButton("SUMBIT");
        jButton.setBounds(150,310,150,30);
        jFrame.add(jButton);
        jButton.addActionListener(this);
        //---end----/
        //--Adding Level----//
        t = new JLabel("Count ");
        t.setBounds(40,10,250,30);
        jFrame.add(t);

        //----Adding Frame Layout---//
        jFrame.setLayout(null);
        jFrame.setSize(400,400);
        jFrame.setTitle("Sriabhikkk");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//terminaitong the program
        //-----//////
    }

    //working outside constructor/////
    //----action on click button----//
    @Override
    public void actionPerformed(ActionEvent e) {
        String text = jTextArea.getText();
        String word[] = text.split(" ");
        t.setText("Character :  " + text.length() +  "Word : " +  word.length) ;
    }
    //-----------------------------//
    public static void main(String[] args) {
        javaswing_5 j = new javaswing_5();

    }

}
