package jodatDateTime;

import java.time.LocalDateTime;
import java.time.Month;

public class CustomDates {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(1995,Month.MAY,28,12,45);
        System.out.println(dt);
        System.out.println("After 6 months " + dt.plusMonths(6));
        System.out.println("Before 6 months " + dt.minusMonths(6));
    }
}
