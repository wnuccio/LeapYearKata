import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YearTest {

    @Test
    void not_leap_if_not_divisible_by_4() {
        assertTrue( ! new Year(1997).isLeap());
    }

    @Test
    void leap_if_divisible_by_4() {
        assertTrue(new Year(1996).isLeap());
    }

    @Test
    void not_leap_if_divisible_by_4_but_not_by_400() {
        assertTrue( ! new Year(1800).isLeap());
    }

    @Test
    void leap_if_divisible_by_400() {
        assertTrue(new Year(1600).isLeap());
    }


}
