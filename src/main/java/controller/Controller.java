package controller;

import domain.Ladder;
import view.OutputView;

public class Controller {
    public void run() {
        int row = 4;
        int column = 4;
        Ladder ladder = new Ladder(row, column);
        OutputView.printLadder(ladder, row, column);
    }
}
