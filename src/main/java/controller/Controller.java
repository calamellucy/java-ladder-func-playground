package controller;

import domain.Ladder;
import view.InputView;
import view.OutputView;

public class Controller {
    public void run() {
        int column = InputView.inputColumn();
        int row = InputView.inputRow();
        Ladder ladder = new Ladder(row, column);
        OutputView.printLadder(ladder, row, column);
    }
}
