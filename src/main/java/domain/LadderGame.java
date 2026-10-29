package domain;

import java.util.ArrayList;
import java.util.List;

public class LadderGame {
    private final Ladder ladder;

    public LadderGame(Ladder ladder) {
        this.ladder = ladder;
    }

    public List<Integer> getResult() {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < ladder.getColumn(); i++) {
            resultList.add(playGame(i));
        }
        return resultList;
    }

    public int playGame(int start) {
        int position = start;
        for (int row = 0; row < ladder.getRow(); row++) {
            position = move(row, position);
        }
        return position;
    }

    private int move(int row, int position) {
        if (canMoveLeft(row, position)) {
            return position - 1;
        }
        if (canMoveRight(row, position)) {
            return position + 1;
        }
        return position;
    }

    private boolean canMoveLeft(int row, int position) {
        if (position == 0) {
            return false;
        }
        return ladder.isConnected(row, position - 1);
    }

    private boolean canMoveRight(int row, int position) {
        if (position == ladder.getColumn() - 1) {
            return false;
        }
        return ladder.isConnected(row, position);
    }
}
