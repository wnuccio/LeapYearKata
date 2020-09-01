import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;

public class LeapYearTest {

    @Test
    void not_leap_if_not_divisible_by_4() {
        assertFalse(new LeapYear().isLeap(1997));

    }
}
