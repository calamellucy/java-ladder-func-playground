import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import domain.Line;
import java.util.List;
import org.junit.jupiter.api.Test;

public class LineTest {

    @Test
    void 세로줄_개수에_맞게_연결_위치가_생성된다() {
        Line line = new Line(4);

        assertEquals(3, line.getPoints().size());
    }

    @Test
    void 인접한_가로선은_서로_겹치지_않는다() {
        for (int attempt = 0; attempt < 100; attempt++) {
            Line line = new Line(4);
            List<Boolean> points = line.getPoints();

            for (int index = 1; index < points.size(); index++) {
                boolean overlapping = points.get(index - 1) && points.get(index);
                assertFalse(overlapping);
            }
        }
    }

    @Test
    void 잘못된_세로줄_개수는_예외가_발생한다() {
        assertThrows(IllegalArgumentException.class, () -> new Line(0));
        assertThrows(IllegalArgumentException.class, () -> new Line(1));
        assertThrows(IllegalArgumentException.class, () -> new Line(-1));
    }
}
