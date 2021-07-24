package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class combo_box implements ActionListener {
    public JFrame jFrame;
    public JLabel label;
    JComboBox checkBox1;
    public combo_box(){
        jFrame = new JFrame();

        //---add level=----//
        label = new JLabel("Food Billing ");
        label.setBounds(50,50,300,20);
        jFrame.add(label);
        jFrame.setLayout(null);
        //---------------------------//
        //--adding checkbox---/
        String city [] = {"Patna","Mumbai"};
        checkBox1 = new JComboBox(city);
        checkBox1.setBounds(100,100,150,20);
       jFrame.add(checkBox1);
        //nested inside button//
        JButton jButton = new JButton("Total",new ImageIcon("C:\\Users\\Abhishek Srivastava\\Downloads\\IMG-20201207-WA0027-removebg-preview.png"));

        jButton.setBounds(100,250,80,30);
        jFrame.add(jButton);

        jButton.addActionListener(this);


        //-----------------------------//
        //---adding frame layout---/
        jFrame.setTitle("Food");
        jFrame.setSize(400,400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //----------------------------//
    }

    public static void main(String[] args) {
        combo_box c = new combo_box();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("you Select city :  " + checkBox1.getItemAt(checkBox1.getSelectedIndex()));//select item

    }
}
