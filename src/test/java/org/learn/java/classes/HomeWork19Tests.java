package org.learn.java.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.Locale;

public class HomeWork19Tests {

    @Test
    public void createDatesTable() {

        DateTimeFormatter firstDateFormat = HomeWork19.createLocalDateTimeFormatterWithOptionalTime("yyyy-MM-dd");
        DateTimeFormatter secondDateFormat = HomeWork19.createLocalDateTimeFormatterWithOptionalTime("MMM dd, yyyy");
        DateTimeFormatter thirdFormat = DateTimeFormatter.ofPattern("dd-MMM-yyyy ha", Locale.UK);
        DateTimeFormatter forthFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.US);

        // 2000-05-25 01:10:12
        LocalDateTime[] date1 = HomeWork19.createDates("1956-03-03",firstDateFormat);
        Duration duration1 = HomeWork19.getPeriod(date1[1],date1[2]);

        LocalDateTime[] date2 = HomeWork19.createDates("Mar. 12, 2001", secondDateFormat);
        Duration duration2 = HomeWork19.getPeriod(date2[1],date2[2]);

        LocalDateTime[] date3 = HomeWork19.createDates("07-Nov-1917 12pm",thirdFormat);
        Duration duration3 = HomeWork19.getPeriod(date3[1],date3[2]);

        LocalDateTime[] date4 = HomeWork19.createDates("2000-05-25 01:10:12",forthFormat);
        Duration duration4 = HomeWork19.getPeriod(date4[1],date4[2]);

    }

    @Test
    public void convertDatesTest() {
        String date1 = "2021-02-28 00:01:02";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime result = HomeWork19.convertStringToLocalDateTime(date1,formatter);
        LocalDateTime expected = LocalDateTime.of(2021,02,28,0,1,2);
        Assertions.assertEquals(expected,result);
    }
}
