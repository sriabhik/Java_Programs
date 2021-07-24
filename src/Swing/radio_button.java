package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class radio_button implements ActionListener {
    public JFrame jFrame;
    public JLabel label;
    JRadioButton checkBox1,checkBox2,checkBox3;
    public radio_button(){
        jFrame = new JFrame();

        //---add level=----//
        label = new JLabel("Food Billing ");
        label.setBounds(50,50,300,20);
        jFrame.add(label);
        jFrame.setLayout(null);
        //---------------------------//

        //--adding checkbox---/
        checkBox1 = new JRadioButton("male");
        checkBox1.setBounds(100,100,150,20);
        checkBox2 = new JRadioButton("Female");
        checkBox2.setBounds(100,150,150,20);
        checkBox3 = new JRadioButton("other");
        checkBox3.setBounds(100,200,150,20);
        //nested inside button//
        JButton jButton = new JButton("Total",new ImageIcon("C:\\Users\\Abhishek Srivastava\\Downloads\\IMG-20201207-WA0027-removebg-preview.png"));

        jButton.setBounds(100,250,80,30);
        jFrame.add(jButton);

        jButton.addActionListener(this);
        //----
        jFrame.add(checkBox1);
        jFrame.add(checkBox2);
        jFrame.add(checkBox3);

        //-----------------------------//
        //---adding frame layout---/
        jFrame.setTitle("Food");
        jFrame.setSize(400,400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //----------------------------//
    }

    public static void main(String[] args) {
        radio_button r = new radio_button();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        String msg = " ";
        if(checkBox1.isSelected()){
            msg  = "Male";
            JOptionPane.showMessageDialog(jFrame,msg+"\n");
            checkBox2.setSelected(false);
            checkBox3.setSelected(false);
        }
        else if(checkBox2.isSelected()){
            msg  = "Female";
            JOptionPane.showMessageDialog(jFrame,msg+"\n");
            checkBox1.setSelected(false);
            checkBox3.setSelected(false);
        }
        else if(checkBox3.isSelected()){
            msg  = "Other";
            JOptionPane.showMessageDialog(jFrame,msg+"\n");
            checkBox1.setSelected(false);
            checkBox2.setSelected(false);
        }
    }
}
