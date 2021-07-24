package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menubar implements ActionListener {
    public JFrame jFrame;
    JMenuBar jMenuBar;
    JMenuItem submenu,file,edit,format,cut,copy ,paste,save,exit,zoom,delete;
    public  JTextArea jTextArea ;
    public menubar(){

        jFrame = new JFrame();

        jTextArea = new JTextArea();
        jTextArea.setBounds(5,5,360,320);
        jFrame.add(jTextArea);
        jMenuBar = new JMenuBar();

        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        zoom = new JMenuItem("Zoom");
        save = new JMenuItem("Save");
        exit = new JMenuItem("exit");

        delete = new JMenuItem("Delete");

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = JOptionPane.showConfirmDialog(jFrame,"Want To Exit?");
                if(a == JOptionPane.YES_OPTION){
                    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
        });
        file = new JMenu("File");
        edit = new JMenu("Edit");
        format = new JMenu("Format");
        submenu = new JMenu("Sub menu");
        file.add(submenu);

        submenu.add(delete);

        file.add(save);
        file.add(exit);

        edit.add(copy);
        edit.add(cut);
        edit.add(paste);

        format.add(zoom);

        jMenuBar.add(file);
        jMenuBar.add(edit);
        jMenuBar.add(format);

        jFrame.add(jMenuBar);
        jFrame.setJMenuBar(jMenuBar);
        //----Adding Frame Layout---//
        jFrame.setLayout(null);
        jFrame.setSize(400,400);
        jFrame.setTitle("Sriabhikkk");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//terminaitong the program
        //-----//////
    }


    public static void main(String[] args) {
        menubar m = new menubar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== cut){
            jTextArea.cut();;
        }
        if(e.getSource() == copy){
            jTextArea.copy();
        }
        if(e.getSource() == paste){
            jTextArea.paste();
        }
        if(e.getSource() == delete){
            jTextArea.setText(" ");
        }
    }
}
