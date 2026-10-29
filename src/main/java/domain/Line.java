package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {
    private static final Random RANDOM = new Random();

    private final List<Boolean> points;

    public Line(int num) {
        points = new ArrayList<>();
        initializePoints(num - 1);
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
