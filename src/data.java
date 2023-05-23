/*
* File: data.java
* Author: Kondor Marcell
* Copyright: 2023, Kondor Marcell
* Group: Szoft 1/N
* Date: 2023-05-23
* Github: https://github.com/Kotkodaa
* Licenc: GNU GPL
*/
import java.time.LocalDate;

public class data {
    Integer id;
    String name;
    String city;
    String address;
    LocalDate birth;
    Integer salary;

    public data() {
    }

    public data(
            String name, 
            String city, 
            String address, 
            LocalDate birth, 
            Integer salary
        ) {
        this.name = name;
        this.city = city;
        this.address = address;
        this.birth = birth;
        this.salary = salary;
    }

    public data(Integer id, String name, String city, String address, LocalDate birth, Integer salary) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.address = address;
        this.birth = birth;
        this.salary = salary;
    }
    
}
