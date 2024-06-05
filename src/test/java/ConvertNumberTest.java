import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertNumberTest {

    @Test
    public void givenNumber_valid_itShouldConvertCorrectly(){

        String numberConverted = ConvertNumber.convertNumber(-100);

        assertEquals("-100", numberConverted);
    }
}
