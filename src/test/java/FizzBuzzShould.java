import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {
    @Test
    public void convert_1_to_1() {
        assertEquals("1", FizzBuzz.convert(1));
    }
}
