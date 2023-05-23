/*
* File: Maincontroller.java
* Author: Kondor Marcell
* Copyright: 2023, Kondor Marcell
* Group: Szoft 1/N
* Date: 2023-05-23
* Github: https://github.com/Kotkodaa
* Licenc: GNU GPL
*/
import java.util.ArrayList;


public class Maincontroller {
    Mainframe Mainframe;
    ArrayList<data> personList;
    int actual;
    public Maincontroller() {
        actual = 0;
        Mainframe = new Mainframe();
        personList = Input_txt.load();
        handleEvent();
        loaddata(personList.get(0));
    }
    private void handleEvent() {
        Mainframe.getPrevButton()
        .addActionListener( e -> {
            startPrev();
        });
        Mainframe.getNextButton()
        .addActionListener( e -> {
            startNext();
        });
    }
    private void startPrev() {
        if(actual > 0) {
            actual--;
            loaddata(personList.get(actual));
        }
    }
    private void startNext() {
        int count = personList.size();
        if(actual < count -1) {
            actual++;
            loaddata(personList.get(actual));
        }
    }
    private void loaddata(data personList) {
        this.Mainframe.namePanel.setValue(personList.name);
        this.Mainframe.cityPanel.setValue(personList.city);
        this.Mainframe.addressPanel.setValue(personList.address);
        this.Mainframe.birthPanel.setValue(personList.birth.toString());
        this.Mainframe.salaryPanel.setValue(personList.salary.toString());
    }
}
