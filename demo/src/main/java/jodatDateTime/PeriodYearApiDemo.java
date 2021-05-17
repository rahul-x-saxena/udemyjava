package jodatDateTime;

import java.time.*;

public class PeriodYearApiDemo {
    public static void main(String[] args) {
        // Find your age
        LocalDate dob = LocalDate.of(1990,5,30);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dob,currentDate);
        System.out.printf("Your age is %d Years , %d months , %d days",
                period.getYears() , period.getMonths() , period.getDays());

        ZoneId zone = ZoneId.systemDefault();
        System.out.println("\n" +zone);

        ZoneId la = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime dateTime = ZonedDateTime.now(la);
        System.out.println(dateTime);
    }
}
