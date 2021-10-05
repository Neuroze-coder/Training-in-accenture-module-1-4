import java.time.LocalDateTime;
import java.util.*;

/**
 * Необходимо реализовать метод , определяющий относиться ли параметр dataTime к выходным
 * Выходным считается промежуток между 22:00 пятницы и 23:00 воскресенья
 * при попадании параметра в указанный промежуток метод возвращает true
 */

public class WeekEnds {

    private static int friday = 5;
    private static int saturday = 6;
    private static int sunday = 7;
    private static int weekendStart = 22;
    private static int weekendEnd = 23;

    public static void main(String[] args) {

        List<LocalDateTime> dateTimeList = new ArrayList<>();
        dateTimeList.add(LocalDateTime.of(2021, 10, 1, 21, 50));
        dateTimeList.add(LocalDateTime.of(2021, 10, 1, 22, 1));
        dateTimeList.add(LocalDateTime.of(2021, 10, 2, 14, 10));
        dateTimeList.add(LocalDateTime.of(2021, 10, 3, 22, 59));
        dateTimeList.add(LocalDateTime.of(2021, 10, 3, 23, 12));
        dateTimeList.add(LocalDateTime.of(2021, 10, 4, 10, 15));
        dateTimeList.add(LocalDateTime.of(2021, 10, 5, 12, 15));
        dateTimeList.add(LocalDateTime.of(2021, 10, 6, 12, 15));
        dateTimeList.add(LocalDateTime.of(2021, 10, 9, 12, 15));

        for (LocalDateTime dateTime : dateTimeList) {
            System.out.println(dateTime + " выходной? " + isWeekendDay(dateTime));
        }

    }

    public static boolean isWeekendDay(LocalDateTime dateTime) {
        if (dateTime.getDayOfWeek().getValue() == saturday) {
            return true;
        } else if ((dateTime.getDayOfWeek().getValue() == friday) & (dateTime.getHour() >= weekendStart)) {
            return true;
        } else if (dateTime.getDayOfWeek().getValue() == sunday & dateTime.getHour() < weekendEnd) {
            return true;
        } else {
            return false;
        }
    }
}
