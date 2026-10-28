package JavaTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;


public class CalendarApp2 {
    static void main(String[] args) {
        LocalDate data = LocalDate.now();
        System.out.println("Data: " + data);

        Calendar agora = Calendar.getInstance();
        agora.add(Calendar.MONTH, 2);
        agora.add(Calendar.DAY_OF_MONTH, 5);
        agora.add(Calendar.HOUR, 10);
        agora.add(Calendar.MINUTE, 5);
        agora.add(Calendar.SECOND, 58);
        agora.add(Calendar.AM_PM, 7);

        System.out.println(agora.getTime());

        System.out.println(agora.get(Calendar.DAY_OF_MONTH));
        System.out.println(agora.get(Calendar.YEAR));

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        int f = 5;
        while (f>=2){
            formatter.setTimeZone(TimeZone.getTimeZone("GMT-" + f--));
            System.out.println(formatter.format(gregorianCalendar.getTime()));
        }
    }
}
