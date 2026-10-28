package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {
    private final List<Boolean> points;

    public Line(int num) {
        points = new ArrayList<>();
        initializePoints(num - 1);
    }

    private void initializePoints(int count) {
        for (int i = 0; i < count; i++) {
            if (i == 0 || !points.get(i - 1)) {
                Random random = new Random();
                points.add(random.nextBoolean());
                continue;
            }
            points.add(false);
        }
    }

    public List<Boolean> getPoints() {
        return points;
    }

}
