package org.learn.java.classes;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;

public class PlayWithLocaDate {

    public LocalDate generateDate(Month month) {
        return LocalDate.of(Year.now().getValue(),month, MonthDay.now().getDayOfMonth());
    }

    public static void main(String[] args) {
        PlayWithLocaDate p = new PlayWithLocaDate();
        LocalDate d = p.generateDate(Month.AUGUST);
        System.out.println(d.toString());
        LocalDate ld = d.minusDays(5);
        System.out.println(ld.toString());
    }


}
