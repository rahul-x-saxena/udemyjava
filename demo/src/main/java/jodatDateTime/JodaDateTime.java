package jodatDateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class JodaDateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Current system date " + date);

        LocalTime time = LocalTime.now();
        System.out.println("Current system time " +time);

        System.out.printf("Date in dd-mm-yyyy format is  > %d-%d-%d" ,
                date.getDayOfMonth(),date.getMonthValue(),date.getYear());

        System.out.println();

        System.out.printf("Hour , min , sec , nanosec  > %d , %d , %d , %d",
                time.getHour(),time.getMinute(),time.getSecond(),time.getNano());
    }
}
