import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calenadar {
    public static void main(String[] args) {
        GregorianCalendar myC = new GregorianCalendar();

        myC.set(Calendar.MONTH, 2);

        System.out.println(myC.get(myC.YEAR) + ":" + myC.get(myC.MONTH) + ":"
        + myC.get(myC.DAY_OF_WEEK));

    }
}
