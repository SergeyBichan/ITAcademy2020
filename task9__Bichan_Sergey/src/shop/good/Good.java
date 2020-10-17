package shop.good;

import java.util.Date;
import java.util.GregorianCalendar;

public class Good {
    private int id = 0;
    private String name = "";


    public Good(int id, String name, GregorianCalendar gregorianCalendar) {
    }

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

//    public Good(int id, String name, String date) {
//        this.id = id;
//        this.name = name;
//        this.date = date;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private String date = "";


}
