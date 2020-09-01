import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {

    @Test
    void not_leap_if_not_divisible_by_4() {
        assertTrue( ! new LeapYear(1997).isLeap());
    }

    @Test
    void leap_if_divisible_by_4() {
        assertTrue(new LeapYear(1996).isLeap());
    }

    @Test
    void not_leap_if_divisible_by_4_but_not_by_400() {
        assertTrue( ! new LeapYear(1800).isLeap());
    }

    @Test
    void leap_if_divisible_by_400() {
        assertTrue(new LeapYear(1600).isLeap());
    }


}
