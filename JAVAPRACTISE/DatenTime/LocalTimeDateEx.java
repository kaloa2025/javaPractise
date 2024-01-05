package DatenTime;

import java.time.*;
import static java.time.Month.*;
import static java.time.temporal.ChronoUnit.*;

public class LocalTimeDateEx {
    public static void main(String[] args) {
        LocalDateTime meeting, flight, courseStart, courseEnd;
        meeting = LocalDateTime.of(2014, MARCH, 21, 13, 30);
        System.out.println("Meeting is on : "+meeting);
        LocalDate flighDate = LocalDate.of(2014,MARCH,31);
        LocalTime flighTime = LocalTime.of(21, 45);
        flight = LocalDateTime.of(flighDate, flighTime);
        System.out.println("Flight leaves : "+flight);

        courseStart=LocalDateTime.of(2014, MARCH, 24,9,00);
        courseEnd=courseStart.plusDays(4).plusHours(0);
        System.out.println("Course Starts: "+courseStart);
        System.out.println("Course End: "+courseEnd);

        long courseHrs = (courseEnd.getHour()-courseStart.getHour())*(courseStart.until(courseEnd,DAYS)+1);
        System.out.println("Course is: "+courseHrs+"hours long");
    }    
}
