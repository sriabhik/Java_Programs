package Swing;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class windowListener {

    public JFrame jFrame;

    public windowListener() {

        jFrame = new JFrame();
        jFrame.addWindowListener(new WindowAdapter() {//adding action on cut button
            @Override
            public void windowClosing(WindowEvent e) {
                int a = JOptionPane.showConfirmDialog(jFrame, "exit?");
                if (a == JOptionPane.YES_OPTION) {
                    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
        });

        //----Adding Frame Layout---//
        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setTitle("Sriabhikkk");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//terminaitong the program
        //-----//////
    }

    public static void main(String[] args) {
        windowListener w = new windowListener();
    }
}

