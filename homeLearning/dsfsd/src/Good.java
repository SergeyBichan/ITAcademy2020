import java.util.GregorianCalendar;

public class Good {
    private String name;
    private GregorianCalendar date;

    public Good(GregorianCalendar date) {
        this.date = date;
    }

    public Good() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }
}
