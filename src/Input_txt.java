/*
* File: Input_txt.java
* Author: Kondor Marcell
* Copyright: 2023, Kondor Marcell
* Group: Szoft 1/N
* Date: 2023-05-23
* Github: https://github.com/Kotkodaa
* Licenc: GNU GPL
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Input_txt {

    static final String FILE_NAME = "berkft.txt";
    public Input_txt() {
    }

    public static ArrayList<data> load() {
        ArrayList<data> dataList = null;
        try {
            dataList = tryLoad();
        } catch (FileNotFoundException e) {
            System.err.println("Error! File is not.. található");
           
        }
        return dataList;
    }
    public static ArrayList<data> tryLoad() throws FileNotFoundException {
        ArrayList<data> dataList = new ArrayList<>();
        File file = new File(FILE_NAME);
        try (Scanner scanner = new Scanner(file, "utf-8")) {      
            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] lineArray = line.split(":");
                data dat = new data();
                dat.name = lineArray[0];
                dat.city = lineArray[1];
                dat.address = lineArray[2];
                String[] dataStrArray = lineArray[3].split("-");
                int year = Integer.parseInt(dataStrArray[0]);
                int month = Integer.parseInt(dataStrArray[1]);
                int day = Integer.parseInt(dataStrArray[2]);
                dat.birth = LocalDate.of(year, month, day);
                dat.salary = Integer.parseInt(lineArray[4]);

                dataList.add(dat);            

            }
        } catch (NumberFormatException e) {
            // TODO Ezt ide tettem mert a Scanner alá volt húzva sárgával, és én ezt a kék színt jobban szeretem.
            e.printStackTrace();
        }
        return dataList;
    }
}
