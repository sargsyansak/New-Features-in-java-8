package NewFeaturesInJava8.newdate_timeapi;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class NewDateMain {
    public static void main(String[] args) {
//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());
//
//        System.out.println(LocalDate.of(2020, Month.SEPTEMBER, 23));
//        System.out.println(LocalDate.of(2021, 1, 1));
//        System.out.println(LocalDate.ofYearDay(2020,361));
//
//        System.out.println(LocalTime.ofSecondOfDay(9_124));
//        System.out.println(LocalTime.ofNanoOfDay(100_000_000_000L));


//        System.out.println(LocalDateTime.of(1992, Month.AUGUST, 24, 12, 0));
//        System.out.println(LocalDateTime.of(2004, Month.AUGUST, 23, 17, 15, 2));
//        System.out.println(LocalDateTime.of(2008, Month.JANUARY, 6, 20, 45, 2, 2));
//        System.out.println(LocalDateTime.of(2009, 1, 13, 9, 7));
//        System.out.println(LocalDateTime.of(2012, 4, 4, 6, 16));
//        System.out.println(LocalDateTime.of(2018, 10, 14, 4, 20));
//        System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.now()));

        LocalDate now = LocalDate.now();
//        LocalDate plus2Days = now.plusDays(2);
//        LocalDate plusWeek = now.plusWeeks(1);
//        LocalDate plusPeriod = now.plus(Period.ofDays(3));
//        LocalDate plusMillennia = now.plus(1, ChronoUnit.MILLENNIA);
//        System.out.println(plusMillennia);
//        System.out.println(plusPeriod);
//        System.out.println(plusWeek);
//        System.out.println(plus2Days);
//        System.out.println(now);

        String nativ = now.format(DateTimeFormatter.ofPattern("dd MMM yyyy"));
        String french = now.format(DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.CHINESE));
//        System.out.println(nativ);
//        System.out.println(french);

//        String rfcFormat = now.format(DateTimeFormatter.ofPattern("D, dd MMM yyyy hh:mm:ss"));
//        System.out.println(rfcFormat);

        ZonedDateTime nowe = ZonedDateTime.now();

        LocalDate localDate = LocalDate.of(2019, 5, 16);
//        System.out.println(localDate);
        LocalTime localTime = LocalTime.of(10, 30);
//        System.out.println(localTime);
        ZoneId zone = ZoneId.of("Europe/Kiev");
//        System.out.println(zone);
        ZonedDateTime kievTime = ZonedDateTime.of(localDate, localTime, zone);
//        System.out.println(kievTime);

        List<String> zones = new ArrayList<>(ZoneId.getAvailableZoneIds());
//        zones.forEach(System.out::println);

        LocalDate nextBirthday = LocalDate.of(2019,8,6);
        LocalDate nowr = LocalDate.now();

        Period period = Period.between(now, nextBirthday);
        int days = period.getDays();

//        System.out.println(nowr);
//        System.out.println(period);
//        System.out.println(days);

        LocalDate localDate1 = LocalDate.of(2019,Month.MAY,10);
//        System.out.println(localDate1);

        TemporalAdjuster firstDayOfMonth = TemporalAdjusters.firstDayOfMonth();
        TemporalAdjuster firstDayOfNextMonth = TemporalAdjusters.firstDayOfNextMonth();
        TemporalAdjuster firstDayOfYear = TemporalAdjusters.firstDayOfYear();
        TemporalAdjuster firstDayOfNextYear = TemporalAdjusters.firstDayOfNextYear();

//        System.out.println(localDate1.with(firstDayOfMonth));
//        System.out.println(localDate1.with(firstDayOfNextMonth));
//        System.out.println(localDate1.with(firstDayOfYear));
//        System.out.println(localDate1.with(firstDayOfNextYear));



    }

}
