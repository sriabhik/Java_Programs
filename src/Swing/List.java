package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class List {
    public JFrame jFrame;
    public List(){
        jFrame = new JFrame("This Is jFrame tutorial");

        JLabel j = new  JLabel("Select ");
        j.setBounds(40,50,250,30);
        jFrame.add(j);


        JButton b = new JButton("Click");
        b.setBounds(50,350,100,20);
        jFrame.add(b);

        DefaultListModel<String> l1 = new DefaultListModel<String>();
        l1.addElement("A");
        l1.addElement("B");
        l1.addElement("C");
        l1.addElement("D");

        DefaultListModel<String> l2 = new DefaultListModel<String>();

        l2.addElement("E");
        l2.addElement("F");
        l2.addElement("G");
        l2.addElement("H");

        JList name = new JList(l1);
        JList surname = new JList(l2);

        name.setBounds(100,100,75,75);
        surname.setBounds(100,200,75,75);
        jFrame.add(name);
        jFrame.add(surname);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = " ";
                if(name.getSelectedValue() != null){
                    data = (String) name.getSelectedValue();
                    j.setText(data);
                }
                if(surname.getSelectedValue() != null){
                    data = (String) surname.getSelectedValue();
                    j.setText(data);
                }
            }
        });
        jFrame.setLayout(null);
        jFrame.setSize(400,400);
        jFrame.setTitle("Kinu");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        List l = new List();
    }
}
