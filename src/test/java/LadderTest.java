import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import domain.Ladder;
import domain.Line;
import org.junit.jupiter.api.Test;

public class LadderTest {

    @Test
    void 행_개수만큼_라인이_생성된다() {
        Ladder ladder = new Ladder(4, 4);

        assertEquals(4, ladder.getLines().size());
    }

    @Test
    void 모든_라인은_올바른_개수의_연결_위치를_가진다() {
        Ladder ladder = new Ladder(4, 4);

        for (Line line : ladder.getLines()) {
            assertEquals(3, line.getPoints().size());
        }
    }

    @Test
    void 잘못된_사다리_크기는_예외가_발생한다() {
        assertThrows(IllegalArgumentException.class, () -> new Ladder(0, 4));
        assertThrows(IllegalArgumentException.class, () -> new Ladder(-1, 4));
        assertThrows(IllegalArgumentException.class, () -> new Ladder(4, 0));
        assertThrows(IllegalArgumentException.class, () -> new Ladder(4, 1));
        assertThrows(IllegalArgumentException.class, () -> new Ladder(4, -1));
    }

    @Test
    void 최소_크기의_사다리는_정상적으로_생성된다() {
        Ladder ladder = new Ladder(1, 2);

        assertEquals(1, ladder.getLines().size());
        assertEquals(1, ladder.getLines().get(0).getPoints().size());
    }
}
