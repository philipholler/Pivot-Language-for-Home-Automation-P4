package utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;

public class TimeUtils {

    public static LocalTime getTime(int hours, int minutes){
        String stringHours = "" + hours;
        String stringMinutes = "" + minutes;
        if(hours < 10){
            stringHours = "0" + hours;
        }
        if(minutes < 10){
            stringMinutes = "0" + minutes;
        }
        return LocalTime.parse("" + stringHours + ':' + stringMinutes + ':' + "00");
    }

    public static LocalDate getDate(int day, int month, int year){
        String stringDay = "" + day;
        String stringMonth = "" + month;

        if(day < 10){
            stringDay = "0" + day;
        }
        if(month < 10){
            stringMonth = "0" + month;
        }
        return LocalDate.parse("" + year + '-' + stringMonth + '-' + stringDay);
    }

    public static MonthDay getMonthDay(int day, int month){
        String stringDay = "" + day;
        String stringMonth = "" + month;

        if(day < 10){
            stringDay = "0" + day;
        }
        if(month < 10){
            stringMonth = "0" + month;
        }
        return MonthDay.parse("--" + stringDay + '-' + stringMonth);
    }

    public static LocalDateTime getDateAndTime(int hours, int minutes, int seconds, int day, int month, int year){
        LocalDate date = getDate(day, month, year);
        LocalTime time = getTime(hours, minutes);

        return LocalDateTime.of(date, time);
    }
}