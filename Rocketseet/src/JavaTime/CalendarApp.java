package JavaTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class CalendarApp {
    static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        Date data = agora.getTime();
        System.out.println("Data: " + data);

        String stringDataBr = "17/01/2025";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate stringData = LocalDate.parse(stringDataBr, formatter);
        System.out.println("Data2: " + formatter.format(stringData));
    }
}
