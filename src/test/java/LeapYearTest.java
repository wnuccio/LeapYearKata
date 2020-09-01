import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {

    @Test
    void not_leap_if_not_divisible_by_4() {
        assertFalse(new LeapYear().isLeap(1997));
    }

    @Test
    void leap_if_divisible_by_4() {
        assertTrue(new LeapYear().isLeap(1996));
    }


}
