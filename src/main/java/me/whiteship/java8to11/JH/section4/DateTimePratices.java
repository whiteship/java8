package me.whiteship.java8to11.JH.section4;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateTimePratices {

    public static void main(String[] args) {
        // machine time
        //// 그리니치 기준 시간
        Instant instant = Instant.now();
        System.out.println(instant);    // 기준시 UTC(GMT)

        //// zone 설정
        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);

        //// zone 시간 설정
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
        System.out.println(zonedDateTime);

        // human time
        //// 로컬 타임
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime birthDay =
                LocalDateTime.of(1982, Month.JULY, 15, 0, 0, 0);

        ZonedDateTime nowInKorea = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println(nowInKorea);

        // 기간 표현 방법
        LocalDate today = LocalDate.now();
        LocalDate thisYearBirthday = LocalDate.of(2022, Month.JULY, 15);

        Period period = Period.between(today, thisYearBirthday);
        System.out.println(period.getDays());

        Period until = today.until(thisYearBirthday);
        System.out.println(until.get(ChronoUnit.DAYS));

        Instant now1 = Instant.now();
        Instant plus = now1.plus(10, ChronoUnit.SECONDS);
        Duration between = Duration.between(now1, plus);
        System.out.println(between.getSeconds());

        // 포메팅
        LocalDateTime now2 = LocalDateTime.now();
        DateTimeFormatter MMddyyyy = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(now2.format(MMddyyyy));

        // 파싱
        LocalDate parse = LocalDate.parse("07/15/1982", MMddyyyy);
        System.out.println(parse);

        // 레거시 호환
        Date date = new Date();
        Instant instant2 = date.toInstant();
        Date newDate = Date.from(instant2);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        ZonedDateTime dateTime = gregorianCalendar.toInstant().atZone(ZoneId.systemDefault());
        GregorianCalendar from = GregorianCalendar.from(dateTime);

        ZoneId zoneId = TimeZone.getTimeZone("PST").toZoneId();
        TimeZone timeZone = TimeZone.getTimeZone(zoneId);
    }
}
