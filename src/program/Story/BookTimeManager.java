package program.Story;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import static java.lang.Math.abs;

public class BookTimeManager {
    public Chapter chapter;
    public LocalTime BookTime = LocalTime.of(8,0, 0);
    public String book_time_seconds = BookTime.format(DateTimeFormatter.ofPattern("ss"));
    private int i = 0;
    public BookTimeManager(Chapter chapter){
        this.chapter = chapter;
    }
    public TimeOfDay getTimePeriod(LocalTime time){
        switch(time.getHour()){
                case 23:
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7: {
                    return TimeOfDay.NIGHT;
                }
                case 8:
                case 9:
                case 10:
                case 11:
                case 12: {
                    return TimeOfDay.MORNING;
                }
                case 13:
                case 14:
                case 15:
                case 16:
                case 17: {
                    return TimeOfDay.AFTERNOON;
                }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22: {
                    return TimeOfDay.EVENING;
                }

        }
        return TimeOfDay.AFTERNOON;
    }


    public void go() {
        while (i < 10) {
            String real_time_seconds = LocalTime.now().format(DateTimeFormatter.ofPattern("ss"));
            if (abs(Integer.parseInt(book_time_seconds) - Integer.parseInt(real_time_seconds)) > 1) {
                TimeOfDay time_period_before = getTimePeriod(BookTime);

                BookTime = BookTime.plusHours(2);
                book_time_seconds = real_time_seconds;

                TimeOfDay time_period_after = getTimePeriod(BookTime);

                i++;
                if (i == 1 || !(time_period_after.getTimeOfDay().equals(time_period_before.getTimeOfDay()) )){
                    System.out.println("    Сейчас "+ time_period_after.getTimeOfDay()+".");
                    chapter.makeActionsOnTime(time_period_after);
                    time_period_before = time_period_after;

                }
            }
        }
    }
}
