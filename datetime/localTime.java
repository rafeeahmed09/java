package datetime;

import java.time.LocalTime;

public class localTime {
    static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Time System : " + time);
        LocalTime custoTime = LocalTime.of(14,30,30);
        System.out.println("custoTime Time" + custoTime);
    }
}
