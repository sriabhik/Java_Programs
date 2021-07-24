package Swing;

import javax.swing.*;

public class javaswing {
    public javaswing(){//JFrame using constructor
        JFrame jFrame = new JFrame();
        jFrame.setSize(400,400);
        jFrame.setTitle("My Project");
        jFrame.setVisible(true);

    }
    public static void main(String[] args) {
        javaswing j = new javaswing();
    }
}
