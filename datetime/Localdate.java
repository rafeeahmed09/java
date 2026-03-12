package datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;

public class Localdate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today : " + today);
        LocalDate now = LocalDate.now();
        System.out.println("Now Date in System " + now);
        LocalDate customDate = LocalDate.of(2004, Month.of(2),5);
        System.out.println("CustomDate  " + customDate);
        int dayofmonth = now.getDayOfMonth();
        System.out.println("datofmonth " + dayofmonth);
        int month = now.getMonthValue();
        System.out.println("month " + month);
        int year = now.getYear();
        System.out.println("year " + year);

         LocalDate yesterday = today.minusDays(1);
        System.out.println("yesterday " + yesterday);
         LocalDate pastDate = today.minusMonths(20);
        System.out.println("pastDate " + pastDate);



    }
}
