package domain;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private final List<Line> lines;

    public Ladder(int row, int column) {
        lines = new ArrayList<>();
        for (int i = 0; i < column; i++) {
            Line line = new Line(row);
            lines.add(line);
        }
    }

    public List<Line> getLines() {
        return lines;
    }
}
