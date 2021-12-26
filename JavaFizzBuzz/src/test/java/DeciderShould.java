import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeciderShould {

    @Test
    @DisplayName("Low value starting test")
    void decideThreeIsFizz() {
        // arrange test conditions
        Decider systemUnderTest = new Decider();

        // act
        String result = systemUnderTest.decide(3);

        // assert
        assertEquals("Fizz", result);
    }
}