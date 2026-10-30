package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {
    private final List<Connection> points;

    public Line(List<Connection> points) {
        this.points = List.copyOf(points);
    }

    private void validateCount(int count) {
        if (count < Ladder.MIN_COLUMN_COUNT) {
            throw new IllegalArgumentException("세로줄 개수는 " +
                    Ladder.MIN_COLUMN_COUNT + " 이상이어야 합니다.");
        }
    }

    public List<Connection> getPoints() {
        return points;
    }

}
