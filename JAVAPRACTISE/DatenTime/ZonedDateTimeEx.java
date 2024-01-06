package DatenTime;
import java.time.*;
import static java.time.temporal.ChronoUnit.*;
import static java.time.LocalDateTime.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.zone.ZoneOffsetTransition;
public class ZonedDateTimeEx {
    public static void main(String[] args) {
        ZoneId USEast=ZoneId.of("America/New_York");
        LocalDateTime lastNight=LocalDateTime.of(2014,Month.MARCH,9,2,30);
        ZoneOffsetTransition zot=USEast.getRules().getTransition(lastNight);
        if(zot!=null)
        {
            if(zot.isGap()){System.out.println("Gap");}
            if(zot.isOverlap()){System.out.println("OverLap");}
        }
    }
}
