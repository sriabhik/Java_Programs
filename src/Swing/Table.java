package Swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Table {

    public JFrame jFrame;
    public Table(){
        jFrame = new JFrame();

        String data[][] = {
                {"1","abhishek","srivastava"},
                {"2","pawan","srivastava"},
                {"3","kinu","srivastava"}
        };
        String column[] = {"id","name","surname"};
        JTable jTable = new JTable(data,column);
        jTable.setCellSelectionEnabled(true);//can select any cell
        ListSelectionModel selectionModel = jTable.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String data = null;
                int [] row = jTable.getSelectedRows();
                int [] column = jTable.getSelectedColumns();

                for(int i = 0 ; i < row.length;i++){
                    for(int j = 0;j < column.length;j++){
                        data = (String) jTable.getValueAt(row[i],column[j]);
                        break;
                    }
                }
                System.out.println("You Selected this data " +data);
            }
        });//change value
    JScrollPane jScrollPane = new JScrollPane(jTable);//scrollable view oof a component
    jFrame.add(jScrollPane);
        //---adding frame layout---/

        jFrame.setTitle("Food");
        jFrame.setSize(400,400);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //----------------------------//
    }

    public static void main(String[] args) {
        Table t = new Table();
    }

}
