/*
* File: InputPanel.java
* Author: Kondor Marcell
* Copyright: 2023, Kondor Marcell
* Group: Szoft 1/N
* Date: 2023-05-23
* Github: https://github.com/Kotkodaa
* Licenc: GNU GPL
*/
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class InputPanel extends JPanel {
    JLabel label;
    JTextField field;
    public InputPanel() {        
        initComponent();
        setPanel();
    }
    public InputPanel(String text) {             
        initComponent();
        label.setText(text);   
        setPanel();
    }
    private void initComponent() {
        label = new JLabel();
        field = new JTextField();
    }
    private void setPanel() {
        add(label);
        add(field);
        setLayout(new GridLayout(1, 2));
        setBorder(new EmptyBorder(5, 10, 5, 10));
    }
    public void setLabel(String text) {
        label.setText(text);
    }
    public String getLabel() {
        return label.getText();
    }
    public void setValue(String text) {
        field.setText(text);
    }
    public String getValue() {
        return field.getText();
    }
}

