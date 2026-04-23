package FCollections.Map;
import java.util.EnumMap;

enum Day { MONDAY, TUESDAY, WEDNESDAY }

public class enum_Maps {
    public static void main(String[] args) {
        // 1. Create an empty EnumMap by passing the enum class
        EnumMap<Day, String> schedule = new EnumMap<>(Day.class);

        // 2. Add elements using put()
        schedule.put(Day.MONDAY, "Gym");
        schedule.put(Day.TUESDAY, "Coding");

        System.out.println(schedule); // Output: {MONDAY=Gym, TUESDAY=Coding}
    }
}
