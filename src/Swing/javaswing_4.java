package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaswing_4 implements ActionListener {////////////////////
    public JFrame jFrame;//public Jframe
    public JLabel t;//public JLabel
    public JTextArea text;//Public Jtextarea

    public javaswing_4(){
        jFrame  = new JFrame();
        //--------------------------------//
        JButton jbutton = new JButton("Enter");//creating Jbutton object
        jbutton.setBounds(40,40,100,30);//setting position of button
        jFrame.add(jbutton);//aadding button to frame
        jbutton.addActionListener(this);//this add the text override here
        //---------------------------//
        //----Adding label text-----//
        t = new JLabel("Journey Has Started");
        t.setBounds(50,90,200,40);
        jFrame.add(t) ;
        //-------------//

        //---Adding textArea----//
        text = new JTextArea("Enter Here");
        text.setBounds(50,120,200,100);
        jFrame.add(text);
        //-------//
      //----Adding Frame Layout---//
        jFrame.setLayout(null);
        jFrame.setSize(500,500);
        jFrame.setTitle("Sriabhik");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//terminaitong the program
        //-----//////
    }
    //working outside constructor/////
    //----action on click button----//
        @Override
        public void actionPerformed(ActionEvent e) {
            t.setText("Kinu");
            text.setText("srivastava");
        }
    //-----------------------------//
    public static void main(String[] args) {
        javaswing_4 j = new javaswing_4();

    }

}
