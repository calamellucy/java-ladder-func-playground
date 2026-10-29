package controller;

import domain.Ladder;
import domain.LadderGame;
import java.util.List;
import view.InputView;
import view.OutputView;

public class Controller {
    public void run() {
        int column = InputView.inputColumn();
        int row = InputView.inputRow();
        Ladder ladder = new Ladder(row, column);
        LadderGame ladderGame = new LadderGame(ladder);
        List<Integer> gameResult = ladderGame.getResult();
        OutputView.printLadder(ladder, row, column);
        OutputView.printResult(gameResult);
    }
}
