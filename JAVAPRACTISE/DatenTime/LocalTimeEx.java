package DatenTime;
import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.*;
public class LocalTimeEx {
        public static void main(String[] args) {
            LocalTime now, nowPlus, nowhrsmin, lunch, bedtime;
            now=LocalTime.now();
            nowPlus=now.plusHours(1).plusMinutes(5);
            nowhrsmin=now.truncatedTo(MINUTES);
            lunch=LocalTime.of(1, 3, 2);
            long minsToLunch=now.until(lunch, MINUTES);
            bedtime=LocalTime.of(21,0);
            long hrsToBed=now.until(bedtime, HOURS);

            System.out.println("NOW : "+now);
            System.out.println("Time 1 hr 5 mins from now : "+nowPlus);
            System.out.println("Truncated time : "+nowhrsmin);
            System.out.println("Is lunch in future : "+lunch.isAfter(now));
            System.out.println("Minutes till lunch : "+minsToLunch);
            System.out.println("Hours to bedtime: "+hrsToBed);
            System.out.println("It is "+now.toSecondOfDay()/60+ "th minute");
            
        }
}
