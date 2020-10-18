package shop.good;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Good {
    private int id;
    private String name;
    private GregorianCalendar date;

    public void ListGood(int id, String name, GregorianCalendar date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

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

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public String getDate() {
        int y = date.get(Calendar.YEAR);
        int m = date.get(Calendar.MONTH);
        int d = date.get(Calendar.DAY_OF_MONTH);

        return (y + "." + m + "." + d);
    }
}


