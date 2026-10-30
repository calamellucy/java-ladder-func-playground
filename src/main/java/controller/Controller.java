package controller;

import domain.ColumnCount;
import domain.Ladder;
import domain.LadderGame;
import domain.LadderGenerator;
import domain.RowCount;
import java.util.List;
import view.InputView;
import view.OutputView;

public class Controller {
    public void run() {
        ColumnCount column = new ColumnCount(InputView.inputColumn());
        RowCount row = new RowCount(InputView.inputRow());
        Ladder ladder = new LadderGenerator().generate(row, column);
        LadderGame ladderGame = new LadderGame(ladder);
        List<Integer> gameResult = ladderGame.getResult();
        OutputView.printLadder(ladder);
        OutputView.printResult(gameResult);
    }
}
