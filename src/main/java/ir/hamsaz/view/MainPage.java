package ir.hamsaz.view;

import ir.hamsaz.controller.Controller;
import ir.hamsaz.view.components.buttons.BrowseButton;
import ir.hamsaz.view.components.BrowseTextField;
import ir.hamsaz.view.components.buttons.Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MainPage extends JFrame {
    private JPanel panel;
    private Button browseButton = new BrowseButton();
    private BrowseTextField browseTextField = new BrowseTextField();
    private JFileChooser fileChooser = new JFileChooser();
    private Controller controller = new Controller();

    public MainPage(){
        //Loading Components
        panel = new JPanel();
        JScrollPane panel2 = new JScrollPane();

        //editing frame
        setLocationRelativeTo(null);
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel2.setBounds(0,100,this.getWidth(),this.getHeight());
        String[] headers = {"Id", "Name"};
        panel2.add(new JTable());
        panel.setBackground(Color.BLUE);
        panel2.setBackground(Color.GREEN);

        panel.setBounds(0,100,getWidth(),getHeight());

        initializeActionListeners();
        //Put together
        panel.add(browseTextField);
        panel.add(browseButton);
        add(panel2);
        add(panel);

        //show
        setVisible(true);
    }

    private void initializeActionListeners() {
        browseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = fileChooser.showOpenDialog(panel);
                if(result == JFileChooser.APPROVE_OPTION){
                    File file = fileChooser.getSelectedFile();
                    browseTextField.setText(file.getPath());
                }
            }
        });
    }

}
