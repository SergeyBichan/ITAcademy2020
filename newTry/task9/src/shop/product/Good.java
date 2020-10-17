package shop.product;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Good {
    private int id;
    private String name;
    private GregorianCalendar date;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        int d = date.get(Calendar.DAY_OF_MONTH);
        int m = date.get(Calendar.MONTH);
        int y = date.get(Calendar.YEAR);
        return d + "-" + m + "-" + y;
    }


}
