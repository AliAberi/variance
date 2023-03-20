package ir.hamsaz.view.components;

import javax.swing.*;

public class BrowseTextField extends JTextField {
    public BrowseTextField(){
        setText("C:");
        setColumns(20);
        setEnabled(false);
    }
}
