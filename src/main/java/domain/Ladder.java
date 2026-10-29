package domain;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private static final int MIN_ROW_COUNT = 1;
    public static final int MIN_COLUMN_COUNT = 2;

    private final List<Line> lines;

    public Ladder(int row, int column) {
        validateSize(row, column);
        lines = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            Line line = new Line(column);
            lines.add(line);
        }
    }

    private void validateSize(int row, int column) {
        if (row < MIN_ROW_COUNT || column < MIN_COLUMN_COUNT) {
            throw new IllegalArgumentException("행은 " + MIN_ROW_COUNT
                    + " 이상, 열은 " + MIN_COLUMN_COUNT + " 이상이어야 합니다.");
        }
    }

    public List<Line> getLines() {
        return lines;
    }
}
