package org.learn.java.classes;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;


public class HomeWork19 {

    public static LocalDateTime[] createDates(String inputDate, DateTimeFormatter formatter) {
        LocalDateTime[] result = new LocalDateTime[3];
        try {
            result[0] = LocalDateTime.parse(inputDate, formatter);
        } catch (Exception ex) {
            throw new RuntimeException("Cannot parse input date: " + inputDate,ex);
        }
        result[1] = result[0].plus(2, ChronoUnit.DAYS);
        result[2] = result[1].minusHours(15).minusMinutes(10);
        return result;

    }

    public static Duration getPeriod(LocalDateTime start, LocalDateTime end) {
        return Duration.between(start,end);
    }

    public static String[] convertToStrings(LocalDateTime[] input, String pattern, Duration duration) {
        String[] result = new String[input.length+1];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        for (int i=0; i < input.length; i++) {
            try {
                result[i] = input[i].format(formatter);
            } catch (Exception ex) {
                throw new RuntimeException("Unable to convert "+input[i].toString()+" into a string using patter: "+pattern, ex);
            }
        }
        result[result.length-1] = duration.toString();
        return result;
    }

    public static DateTimeFormatter createLocalDateTimeFormatterWithOptionalTime(String pattern) {
        DateTimeFormatter dtf =
                new DateTimeFormatterBuilder().appendPattern(pattern+"[ [HH][:mm][:ss][.SSS]]")
                        .parseDefaulting(ChronoField.HOUR_OF_DAY, 0)
                        .parseDefaulting(ChronoField.MINUTE_OF_HOUR, 0)
                        .parseDefaulting(ChronoField.SECOND_OF_MINUTE, 0)
                        .parseDefaulting(ChronoField.SECOND_OF_MINUTE,0)
                        .toFormatter();
        return dtf;
    }

    public static LocalDateTime convertStringToLocalDateTime(String inputDate, DateTimeFormatter formatter) {
        return LocalDateTime.parse(inputDate,formatter);
    }



}
