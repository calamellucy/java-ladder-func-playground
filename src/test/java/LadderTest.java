import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import domain.Connection;
import domain.Ladder;
import domain.Line;
import java.util.List;
import org.junit.jupiter.api.Test;

public class LadderTest {

    @Test
    void 사다리의_연결_상태를_정확하게_조회한다() {
        Line line = new Line(List.of(
                Connection.CONNECTED,
                Connection.DISCONNECTED,
                Connection.CONNECTED
        ));
        Ladder ladder = new Ladder(List.of(line), 4);

        assertEquals(Connection.CONNECTED, ladder.isConnected(0, 0));
        assertEquals(Connection.DISCONNECTED, ladder.isConnected(0, 1));
        assertEquals(Connection.CONNECTED, ladder.isConnected(0, 2));
    }

    @Test
    void 잘못된_사다리_크기는_예외가_발생한다() {
        Line line = new Line(List.of(Connection.DISCONNECTED));

        assertThrows(IllegalArgumentException.class,
                () -> new Ladder(List.of(), 4));
        assertThrows(IllegalArgumentException.class,
                () -> new Ladder(List.of(line), 0));
        assertThrows(IllegalArgumentException.class,
                () -> new Ladder(List.of(line), 1));
        assertThrows(IllegalArgumentException.class,
                () -> new Ladder(List.of(line), -1));
    }

}
