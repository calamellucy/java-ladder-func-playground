package domain;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private final List<Boolean> points;
    private final int count;

    public Line(int num) {
        points = new ArrayList<>();
        count = num;
    }


}
