import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GetDayOfWeekTest {

    @Test
    public void givenDate_isCorrect_ItShouldReturnDayOfWeek(){

        String dayOfWeek = GetDayOfWeek.getDay(8, 14, 2017);

        assertEquals("MONDAY", dayOfWeek);
    }

    @Test
    public void givenDate_hasYearOutsideLowerLimits_ItShouldThrowError(){

        assertThrows(RuntimeException.class, () -> GetDayOfWeek.getDay(8, 14, 1999));
    }

    @Test
    public void givenDate_hasYearOutsideHigherLimits_ItShouldThrowError(){

        assertThrows(RuntimeException.class, () -> GetDayOfWeek.getDay(8, 14, 3001));
    }
}
