package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {
    private static final Random RANDOM = new Random();

    private final List<Boolean> points;

    public Line(int columnNum) {
        validateCount(columnNum);
        points = new ArrayList<>();
        initializePoints(columnNum - 1);
    }

    private void validateCount(int count) {
        if (count < Ladder.MIN_COLUMN_COUNT) {
            throw new IllegalArgumentException("세로줄 개수는 " +
                    Ladder.MIN_COLUMN_COUNT + " 이상이어야 합니다.");
        }
    }

    private void initializePoints(int count) {
        for (int i = 0; i < count; i++) {
            points.add(createPoint(i));
        }
    }

    private boolean createPoint(int index) {
        if (index == 0 || !points.get(index - 1)) {
            return RANDOM.nextBoolean();
        }
        return false;
    }

    public List<Boolean> getPoints() {
        return points;
    }

}
