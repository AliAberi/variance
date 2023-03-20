package ir.hamsaz.view.components;

import javax.swing.*;

public class Table extends JTable {
    public Table(String[][] data, String[] column){
        setEnabled(false);
//        String data[][]={ {"101","Amit","670000"},
//                {"102","Jai","780000"},
//                {"101","Sachin","700000"}};
//        String column[]={"ID","NAME","SALARY"};
        setEditingRow(5);
        setEditingColumn(5);
    }
}
