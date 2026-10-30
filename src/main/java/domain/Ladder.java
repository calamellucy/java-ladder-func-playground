package domain;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private static final int MIN_ROW_COUNT = 1;
    public static final int MIN_COLUMN_COUNT = 2;

    private final List<Line> lines;
    private final int column;

    public Ladder(List<Line> lines, int column) {
        validateSize(lines.size(), column);
        this.lines = List.copyOf(lines);
        this.column = column;
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

    public int getRow() {
        return lines.size();
    }

    public int getColumn() {
        return column;
    }

    public Connection isConnected(int row, int column) {
        return lines.get(row).getPoints().get(column);
    }
}
