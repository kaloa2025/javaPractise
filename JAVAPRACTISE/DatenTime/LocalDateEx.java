package DatenTime;
/*
LocalDate -  class in java
- objects are immutable 
- methods returns a new instance
 */

import java.time.LocalDate;
import static java.time.temporal.TemporalAdjusters.*;
import static java.time.DayOfWeek.*;

public class LocalDateEx {
    public static void main(String[] args) {
        LocalDate now, bDate, nowPlusMonth, nextTues;
        now=LocalDate.now();
        System.out.println(now);
        bDate=LocalDate.of(1995,5,23);
        System.out.println("Javas Bdate: "+bDate);
        System.out.println("Is Java's bday in the past? "+bDate.isBefore(now));
        System.out.println("is JAva's leap year? "+ bDate.isLeapYear());
        System.out.println("Javas Bday of week: "+ bDate.getDayOfWeek());
        nowPlusMonth=now.plusMonths(2);
        System.out.println(nowPlusMonth);
        nextTues = now.with(next(FRIDAY));
        System.out.println(nextTues);
    }
}
