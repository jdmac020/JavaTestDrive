import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CharacterShould {

    @Test
    void startWith1000Hp() {
        Character character = new Character();

        assertEquals(character.health);
    }
}
