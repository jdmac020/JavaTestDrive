import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeciderShould {

    @Test
    void decideThreeIsFizz() {
        // arrange test conditions
        Decider systemUnderTest = new Decider();

        // act
        String result = systemUnderTest.decide(3);

        // assert
        assertEquals("Fizz", result);
    }

    @Test
    void decideFiveIsBuzz() {
        // arrange test conditions
        Decider systemUnderTest = new Decider();

        // act
        String result = systemUnderTest.decide(5);

        // assert
        assertEquals("Buzz", result);
    }

    @Test
    void decideFifteenIsFizzBuzz() {
        // arrange test conditions
        Decider systemUnderTest = new Decider();

        // act
        String result = systemUnderTest.decide(15);

        // assert
        assertEquals("FizzBuzz", result);
    }

    @Test
    void decideTenIsBuzz() {
        // arrange test conditions
        Decider systemUnderTest = new Decider();

        // act
        String result = systemUnderTest.decide(10);

        // assert
        assertEquals("Buzz", result);
    }
}