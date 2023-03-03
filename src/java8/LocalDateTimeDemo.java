package java8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class LocalDateTimeDemo {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        System.out.println(System.currentTimeMillis());

        Date date1 = new Date(1677845264066L);
        System.out.println(date1);

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate.minusDays(1));
        System.out.println(localDate.plusDays(1));
        System.out.println(localDate.getEra());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfMonth());

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());

        LocalTime localTime1 = LocalTime.of(19,0,0);
        System.out.println(localTime.isAfter(localTime1));
        System.out.println(localTime.isBefore(localTime1));

        ZoneId zoneId = ZoneId.of("Africa/Addis_Ababa");
        System.out.println(zoneId);
        LocalDate localDate1 = LocalDate.now(zoneId);
        LocalTime localTime2 = LocalTime.now(zoneId);
        System.out.println(localDate1);
        System.out.println(localTime2);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        System.out.println(localDate);
        System.out.println("=>>>>"+dateTimeFormatter.format(localDate));

        LocalDate localDate10 = LocalDate.of(2000,1,1);
        LocalDate localDate20= LocalDate.of(2023,3,3);

        LocalDateTime l1 = LocalDateTime.of(2000,1,1,0,0,0);
        LocalDateTime l2 = LocalDateTime.of(2023,3,3,0,0,0);

        Duration duration = Duration.between(l1,l2);
        System.out.println(duration.toDays());

        Period period1 = Period.of(2000,1,1);
        Period period2 = Period.of(2023,1,1);
        System.out.println(Period.between(localDate10,localDate20));

    }
}
