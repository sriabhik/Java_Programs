package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaswing_3 extends JFrame {
    public JFrame jFrame;//public Jframe

    public javaswing_3(){
        jFrame  = new JFrame();

        //--------------------------------//

        JButton jbutton = new JButton("Enter");//creating Jbutton object
        jbutton.setBounds(40,40,100,30);//setting position of button
        jFrame.add(jbutton);//aadding button to frame
        //---------------------------//

        //----Adding label text-----//
        JLabel t = new JLabel("Journey Has Started");
        t.setBounds(50,90,100,40);
        jFrame.add(t) ;
        //-------------//

        //---Adding textArea----//
        JTextArea text = new JTextArea("Enter Here");
        text.setBounds(50,120,100,100);
        jFrame.add(text);
        //-------//
        //----action on click button----//
        jbutton.addActionListener(new ActionListener(){//action on click button
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText("Kinu");
                text.setText("srivastava");
                  }
        });
        //-----------------------------//
        //----Adding Frame Layout---//
        jFrame.setLayout(null);
        jFrame.setSize(500,500);
        jFrame.setTitle("Sriabhik");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//terminaitong the program
        //-----//////
    }

    public static void main(String[] args) {
        javaswing_3 j = new javaswing_3();
    }

}
