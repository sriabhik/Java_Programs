package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class check_box implements ActionListener {
    public JFrame jFrame;
    public JLabel label;
    JCheckBox checkBox1,checkBox2,checkBox3;
    public check_box(){
        jFrame = new JFrame();

        //---add level=----//
        label = new JLabel("Food Billing ");
        label.setBounds(50,50,300,20);
        jFrame.add(label);
        jFrame.setLayout(null);
        //---------------------------//

        //--adding checkbox---/
        checkBox1 = new JCheckBox("pizza 100");
        checkBox1.setBounds(100,100,150,20);
        checkBox2 = new JCheckBox("Burger 120");
        checkBox2.setBounds(100,150,150,20);
        checkBox3 = new JCheckBox("Bucket chicken 200");
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

    }

    public static void main(String[] args) {
        check_box c = new check_box();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        String msg = " ";
        if(checkBox1.isSelected()){
            amount += 100;
            msg += "Pizza : 100\n";
        }
        if(checkBox2.isSelected()){
            amount += 120;
            msg += "Burger : 120 \n";
        }
        if(checkBox3.isSelected()){
            amount += 200;
            msg += "Chicken  : 200\n";
        }
        msg += "-----------------";
        JOptionPane.showMessageDialog(jFrame,msg+"\nTotal :"+amount);//use to promt message//
    }

}
