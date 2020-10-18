package Good;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Good {
    private int id;
    private String name;
    private GregorianCalendar date;


    public String getDate() {
        int y = date.get(Calendar.YEAR);
        int m = date.get(Calendar.MONTH);
        int d = date.get(Calendar.DAY_OF_MONTH);

        return  (y+"."+m+"."+d);
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
