package datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

// Zoned date & time
public class zoned {
    static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("ZonedDateTime => " + now);
        // All zoned UTC
        Set<String> availableZoneIDs = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIDs);






    }
}
