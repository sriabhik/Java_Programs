package Swing;

import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.time.chrono.JapaneseChronology;

public class scrollbar  {
    public JFrame jFrame;

    public  scrollbar(){
        jFrame = new JFrame();

        JLabel j = new JLabel();
        j.setHorizontalAlignment(j.CENTER);
        j.setSize(400,100);

        JScrollBar s = new JScrollBar();
        s.setBounds(100,100,50,100);
        s.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                j.setText("Your Position is :  " + s.getValue());
            }
        });
        jFrame.add(j);
        jFrame.add(s);

        //----Adding Frame Layout---//
        jFrame.setLayout(null);
        jFrame.setSize(400,400);
        jFrame.setTitle("Sriabhikkk");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//terminaitong the program
        //-----//////
    }
    public static void main(String[] args) {
        scrollbar s = new scrollbar();
    }
}
