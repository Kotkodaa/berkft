/*
* File: Mainframe.java
* Author: Kondor Marcell
* Copyright: 2023, Kondor Marcell
* Group: Szoft 1/N
* Date: 2023-05-23
* Github: https://github.com/Kotkodaa
* Licenc: GNU GPL
*/
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
// Bodnár Béla:Szeged:Szentimrey u. 80:1989-10-17:330000
public class Mainframe extends JFrame{
    JPanel buttonPanel;
    JButton prevButton;
    JButton nextButton;
    InputPanel namePanel;
    InputPanel cityPanel;
    InputPanel addressPanel;
    InputPanel birthPanel;
    InputPanel salaryPanel;
    public Mainframe() {
        initComponent();
        setComponent();
        setFrame();
    }
    private void initComponent() {
        buttonPanel = new JPanel();
        prevButton = new JButton("before");
        nextButton = new JButton("next");
        namePanel = new InputPanel("name");
        cityPanel = new InputPanel("city");
        addressPanel = new InputPanel("address");
        birthPanel = new InputPanel("birth");
        salaryPanel = new InputPanel("salary");
    }
    private void setComponent() {
        this.buttonPanel.add(prevButton);
        this.buttonPanel.add(nextButton);
    }
    private void setFrame() {
        this.setLayout(
            new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS)
            );
        add(buttonPanel);
        add(namePanel);
        add(cityPanel);
        add(addressPanel);
        add(birthPanel);
        add(salaryPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        // this.pack();
        this.setVisible(true);        
    }
    public JPanel getButtonPanel() {
        return buttonPanel;
    }
    public JButton getPrevButton() {
        return prevButton;
    }
    public JButton getNextButton() {
        return nextButton;
    }
    
}
