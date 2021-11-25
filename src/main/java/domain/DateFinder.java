package domain;

import java.time.LocalDate;
import java.util.Calendar;
public class DateFinder {

    public static LocalDate getDateBeforeMonth(LocalDate date, int period) {
        int notWorkingsDays = 1;
        for (int i = 0; i < period; i++) {
            if (date.minusDays(i).getDayOfWeek().getValue() == Calendar.SATURDAY ||
                    date.minusDays(i).getDayOfWeek().getValue() == Calendar.SUNDAY)
                notWorkingsDays++;
            }
        System.out.println("Not Working Days : "+notWorkingsDays);
        return date.minusDays(period + notWorkingsDays);
    }
}
